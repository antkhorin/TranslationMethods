import gen.*;
import gen.GrammarParser.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Map<String, List<Set<String>>> first;
    private static Map<String, Set<String>> follow;
    private static List<Rule> rules;
    private static PrintWriter writer;

    public static void main(String[] args) throws Exception {
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("input.txt"));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        parser.s();
        Map<String, String> desc = parser.descr;
        rules = parser.rules;
        first = first();
        follow = follow();
        writer = new PrintWriter(new File("src/Parser.java"));
        writer.println("import java.io.*;");
        writer.println("import java.text.ParseException;");
        for (Map.Entry<String, String> entry : desc.entrySet()) {
            writer.println("class " + entry.getKey() + " " + "{");
            writer.println("\t" + entry.getValue().substring(1, entry.getValue().length() - 1));
            writer.println("}");
            writer.println();
        }
        writer.println("public class Parser {");
        writer.println();
        writer.println("private Lexer lex;");
        writer.println();
        writer.print("Tree<");
        if (rules.get(0).varName == null) {
            writer.print("Void");
        } else {
            writer.print(rules.get(0).name);
        }
        writer.print("> parse(InputStream in");
        if (rules.get(0).attrs != null) {
            writer.print(", ");
            writer.print(rules.get(0).attrs.substring(1, rules.get(0).attrs.length() - 1));
        }
        writer.println(") throws ParseException {");
        writer.println("lex = new Lexer(in);");
        writer.println("lex.next();");
        String z = rules.get(0).attrs == null ? "" : rules.get(0).attrs.substring(1, rules.get(0).attrs.length() - 1).replaceAll("(\\w+) (\\w+)", "$2");
        writer.println("return " + rules.get(0).name + "(" + z + ");");
        writer.println("}");
        for (Rule rule : rules) {
            rule(rule);
        }
        writer.println("}");
        writer.close();
        Tree<Void> tree = new Parser().parse(System.in);
    }

    private static void rule(Rule rule) throws IOException {
        writer.print("private ");
        writer.print("Tree<");
        if (rule.varName == null) {
            writer.print("Void");
        } else {
            writer.print(rule.name);
        }
        writer.print("> " + rule.name + "(");
        if (rule.attrs != null) {
            writer.print(rule.attrs.substring(1, rule.attrs.length() - 1));
        }
        writer.println(") throws ParseException {");
        writer.print("Tree<");
        if (rule.varName == null) {
            writer.print("Void");
        } else {
            writer.print(rule.name);
        }
        writer.println("> tree = new Tree<>(\"" + rule.name + "\");");
        if (rule.varName != null) {
            writer.println(rule.name + " " + rule.varName + " = new " + rule.name + "();");
            writer.println("tree.t = " + rule.varName + ";");
        }
        writer.println("switch (lex.get()) {");
        for (int i = 0; i < rule.right.size(); i++) {
            right(rule, i);
        }
        writer.println("default: ");
        writer.print("throw new ParseException(\"ERROR\", lex.pos());");
        writer.println("}");
        writer.println("return tree;");
        writer.println("}");
        writer.println();
    }

    private static void right(Rule rule, int i) {
        for (String s : first.get(rule.name).get(i)) {
            if (!s.equals("'e'")) {
                writer.println("case " + s + ":");
            }
        }
        if (first.get(rule.name).get(i).contains("'e'")) {
            for (String s : follow.get(rule.name)) {
                writer.println("case " + s + ":");
            }
        }
        for (A a : rule.right.get(i).list) {
            if (a.id == 2) {
                writer.println(a.name.substring(1, a.name.length() - 1));
            } else if (a.id == 1) {
                if (!a.name.equals("'e'")) {
                    writer.println("tree.add(new Tree(lex.get() + \"\"));");
                    writer.println("lex.next();");
                }
            } else {
                writer.print("Tree<");
                if (a.varName != null) {
                    writer.print(a.name);
                } else {
                    writer.print("Void");
                }
                writer.println("> tr" + a.name + " = " + a.name + "(" + (a.attrs == null ? "" : a.attrs.substring(1, a.attrs.length() - 1)) + ");");
                if (a.varName != null) {
                    writer.println(a.name + " " + a.varName + " = " + "tr" + a.name + ".get();");
                }
                writer.println("tree.add(tr" + a.name + ");");
            }
        }
        writer.println("break;");
    }

    private static Map<String, List<Set<String>>> first() {
        Map<String, List<Set<String>>> first = new HashMap<>();
        for (Rule rule : rules) {
            first.put(rule.name, new ArrayList<>());
            for (Right right : rule.right) {
                first.get(rule.name).add(new HashSet<>());
            }
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Rule rule : rules) {
                for (int i = 0; i < rule.right.size(); i++) {
                    Right right = rule.right.get(i);
                    int j = 0;
                    while (j < right.list.size()) {
                        A a = right.list.get(j);
                        if (a.id == 0) {
                            for (Set<String> set : first.get(a.name)) {
                                changed |= first.get(rule.name).get(i).addAll(set);
                            }
                            if (first.get(a.name).stream().anyMatch(e -> e.contains("'e'"))) {
                                j++;
                            } else {
                                break;
                            }
                        } else if (a.id == 1) {
                            changed |= first.get(rule.name).get(i).add(a.name);
                            break;
                        } else {
                            j++;
                        }
                    }
                    if (j == right.list.size()) {
                        changed |= first.get(rule.name).get(i).add("'e'");
                    }
                }
            }
        }
        return first;
    }

    private static Map<String, Set<String>> follow() {
        Map<String, Set<String>> follow = new HashMap<>();
        for (Rule rule : rules) {
            follow.put(rule.name, new HashSet<>());
        }
        follow.get(rules.get(0).name).add("'$'");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Rule rule : rules) {
                for (int k = 0; k < rule.right.size(); k++) {
                    Right right = rule.right.get(k);
                    for (int i = 0; i < right.list.size(); i++) {
                        A a = right.list.get(i);
                        if (a.id == 0) {
                            int j = i + 1;
                            while (j < right.list.size()) {
                                A aa = right.list.get(j);
                                if (aa.id == 2) {
                                    j++;
                                    continue;
                                }
                                if (aa.id == 0) {
                                    for (Set<String> set : first.get(aa.name)) {
                                        for (String s : set) {
                                            if (!s.equals("'e'")) {
                                                changed |= follow.get(a.name).add(s);
                                            }
                                        }
                                    }
                                }
                                if (checkEps(aa)) {
                                    j++;
                                } else {
                                    if (aa.id == 1) {
                                        changed |= follow.get(a.name).add(aa.name);
                                    }
                                    break;
                                }
                            }
                            if (j == right.list.size()) {
                                for (String s : follow.get(rule.name)) {
                                    if (!s.equals("'e'")) {
                                        changed |= follow.get(a.name).add(s);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return follow;
    }

    static private boolean checkEps(A a) {
        return a.id == 1 && a.name.equals("'e'") || a.id == 0 && first.get(a.name).stream().anyMatch(e -> e.contains("'e'"));
    }
}