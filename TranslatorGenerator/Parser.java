import java.io.*;
import java.text.ParseException;
class s {
	int val;
}

class e {
	int val;
}

public class Parser {

private Lexer lex;

Tree<s> parse(InputStream in) throws ParseException {
lex = new Lexer(in);
lex.next();
return s();
}
private Tree<s> s() throws ParseException {
Tree<s> tree = new Tree<>("s");
s a = new s();
tree.t = a;
switch (lex.get()) {
case '$':
Tree<e> tre = e(1);
e b = tre.get();
tree.add(tre);
a.val = b.val;
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<e> e(int i) throws ParseException {
Tree<e> tree = new Tree<>("e");
e a = new e();
tree.t = a;
switch (lex.get()) {
case '$':
a.val = i + 1;
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

}
