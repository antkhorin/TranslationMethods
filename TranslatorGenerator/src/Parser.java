import java.io.*;
import java.text.ParseException;
class EE {
	int val = 0;
}

class TT {
	int val = 1;
}

class FF {
	int val = 1;
}

class T {
	int val;
}

class E {
	int val;
}

class F {
	int val;
}

class N {
	int val;
}

public class Parser {

private Lexer lex;

Tree<Void> parse(InputStream in) throws ParseException {
lex = new Lexer(in);
lex.next();
return S();
}
private Tree<Void> S() throws ParseException {
Tree<Void> tree = new Tree<>("S");
switch (lex.get()) {
case '9':
case '(':
case '8':
case '7':
case '6':
case '5':
case '4':
case '3':
case '2':
case '1':
case '0':
Tree<E> trE = E();
E a = trE.get();
tree.add(trE);
System.out.println(a.val);
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<E> E() throws ParseException {
Tree<E> tree = new Tree<>("E");
E a = new E();
tree.t = a;
switch (lex.get()) {
case '9':
case '(':
case '8':
case '7':
case '6':
case '5':
case '4':
case '3':
case '2':
case '1':
case '0':
Tree<T> trT = T();
T b = trT.get();
tree.add(trT);
Tree<EE> trEE = EE();
EE c = trEE.get();
tree.add(trEE);
a.val = b.val + c.val;
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<EE> EE() throws ParseException {
Tree<EE> tree = new Tree<>("EE");
EE a = new EE();
tree.t = a;
switch (lex.get()) {
case '+':
tree.add(new Tree(lex.get() + ""));
lex.next();
Tree<T> trT = T();
T b = trT.get();
tree.add(trT);
Tree<EE> trEE = EE();
EE c = trEE.get();
tree.add(trEE);
a.val = b.val + c.val;
break;
case ')':
case '$':
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<T> T() throws ParseException {
Tree<T> tree = new Tree<>("T");
T a = new T();
tree.t = a;
switch (lex.get()) {
case '9':
case '(':
case '8':
case '7':
case '6':
case '5':
case '4':
case '3':
case '2':
case '1':
case '0':
Tree<F> trF = F();
F b = trF.get();
tree.add(trF);
Tree<TT> trTT = TT();
TT c = trTT.get();
tree.add(trTT);
a.val = b.val * c.val;
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<TT> TT() throws ParseException {
Tree<TT> tree = new Tree<>("TT");
TT a = new TT();
tree.t = a;
switch (lex.get()) {
case '*':
tree.add(new Tree(lex.get() + ""));
lex.next();
Tree<F> trF = F();
F b = trF.get();
tree.add(trF);
Tree<TT> trTT = TT();
TT c = trTT.get();
tree.add(trTT);
a.val = b.val * c.val;
break;
case '+':
case ')':
case '$':
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<F> F() throws ParseException {
Tree<F> tree = new Tree<>("F");
F a = new F();
tree.t = a;
switch (lex.get()) {
case '9':
case '(':
case '8':
case '7':
case '6':
case '5':
case '4':
case '3':
case '2':
case '1':
case '0':
Tree<N> trN = N();
N b = trN.get();
tree.add(trN);
Tree<FF> trFF = FF();
FF c = trFF.get();
tree.add(trFF);
a.val = (int)Math.pow(b.val, c.val);
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<FF> FF() throws ParseException {
Tree<FF> tree = new Tree<>("FF");
FF a = new FF();
tree.t = a;
switch (lex.get()) {
case '^':
tree.add(new Tree(lex.get() + ""));
lex.next();
Tree<F> trF = F();
F b = trF.get();
tree.add(trF);
a.val = b.val;
break;
case '+':
case '*':
case ')':
case '$':
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

private Tree<N> N() throws ParseException {
Tree<N> tree = new Tree<>("N");
N a = new N();
tree.t = a;
switch (lex.get()) {
case '(':
tree.add(new Tree(lex.get() + ""));
lex.next();
Tree<E> trE = E();
E b = trE.get();
tree.add(trE);
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = b.val;
break;
case '0':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 0;
break;
case '1':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 1;
break;
case '2':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 2;
break;
case '3':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 3;
break;
case '4':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 4;
break;
case '5':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 5;
break;
case '6':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 6;
break;
case '7':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 7;
break;
case '8':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 9;
break;
case '9':
tree.add(new Tree(lex.get() + ""));
lex.next();
a.val = 9;
break;
default: 
throw new ParseException("ERROR", lex.pos());}
return tree;
}

}
