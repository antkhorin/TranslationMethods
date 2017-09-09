grammar Grammar;

@parser::header {
    import java.util.*;
}

@parser::members {

    public class Rule{
        public String name;
        public String varName;
        public String attrs;
        public List<Right> right = new ArrayList<>();
    }

    public class Right {
        public List<A> list = new ArrayList<>();
    }

    public class A {
        public String name;
        public String varName;
        public int id;
        public String attrs;

        public A() {}

        public A(String name, String varName, int id, String attrs) {
            this.name = name;
            this.varName = varName;
            this.id = id;
            this.attrs = attrs;
        }
    }

    public Map<String, String> descr = new HashMap<>();
    public List<Rule> rules = new ArrayList<>();
}

s: desc* rul+;
desc: name (VAR {descr.put($name.text, $VAR.text);});
name: WORD;
rul: {Rule rule = new Rule();} ('$' WORD {rule.varName = $WORD.text;} '=')? name {rule.name = $name.text;} (VAR {rule.attrs = $VAR.text;})? ':' (right[rule] '|')* right[rule] {rules.add(rule);};
right[Rule rule]: {Right righ = new Right();} (nterm[righ] | TERM {righ.list.add(new A($TERM.text, null, 1, null));} | CODE {righ.list.add(new A($CODE.text, null, 2, null));})+ {rule.right.add(righ);};
nterm[Right righ]: {A a = new A();} ('$' WORD {a.varName = $WORD.text;} '=')? name {a.name = $name.text;} (VAR {a.attrs = $VAR.text;})? {righ.list.add(a);};

TERM: '\'' (~['])+ '\'';
VAR: '[' (~[[\]])+ ']';
CODE : '{' ( CODE | ~[{}] )* '}';
WORD: [A-Za-z]+;
WS: [ \t\r\n]+ -> skip;