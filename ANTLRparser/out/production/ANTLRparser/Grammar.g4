grammar Grammar;
@parser :: header {
import java.io.*;
}
@parser :: members {
PrintWriter w;
{
    try {
        w = new PrintWriter("Output.java");
    } catch (Exception e) {}
}
}

start: pack? nl imp* clas[0]* {w.close();};
pack: 'package' {w.print("package ");} seq semi nl;
imp: 'import' {w.print("import ");} seq ('.*' {w.print(".*");})? semi nl;
clas[int n]: nl tabs[n] mod? 'class' {w.print("class ");} words ex? lp nl inclas[n + 1] tabs[n] rp nl;
inclas[int n]: (tabs[n] field | method[n])*;
type: inttype | booltype | voidtype;
voidtype: 'void' {w.print("void ");};
var: (inttype word intr? | booltype word boolr?) semi nl;
expr: word (intr | boolr) semi nl;
field: mod? st? var;
method[int n]: nl tabs[n] mod? st? type word lb seq2? rb sp ('throws' {w.print("throws ");} words)? lp nl code[n + 1] tabs[n] rp nl;
code[int n]: (tabs[n] (var | expr | iff[n] | whil[n]))* ret[n]?;
iff[int n]: 'if' {w.print("if ");} lb boolexpr rb sp lp nl code[n + 1] tabs[n] rp ('else' {w.print(" else ");} lp nl code[n + 1] tabs[n] rp)? nl;
whil[int n]: 'while' {w.print("while ");} lb boolexpr rb sp lp nl code[n + 1] tabs[n] rp nl;
ret[int n]: tabs[n] 'return' {w.print("return ");} (intexpr | boolexpr) semi nl;

inttype: 'int' {w.print("int ");};
intr: '=' {w.print(" = ");} intexpr;
intexpr: intexpr plus intterm | intterm;
intterm: intterm mul intvalue | intvalue;
intvalue: lb intexpr rb | num | word | unminus intvalue;
plus: '+' {w.print(" + ");};
mul: '*' {w.print(" * ");};
unminus: '-' {w.print('-');};

booltype: 'boolean' {w.print("boolean ");};
boolr: '=' {w.print(" = ");} boolexpr;
boolexpr: boolexpr or boolterm | boolterm;
boolterm: boolterm and boolvalue | boolvalue;
boolvalue: lb boolexpr rb | bool | word | intexpr ord intexpr;
or: '||' {w.print(" || ");};
and: '&&' {w.print(" && ");};

nl: {w.print('\n');};
sp: {w.print(' ');};
semi: ';' {w.print(";");};
words: word {w.print(' ');};
seq: (word '.' {w.print('.');})* word;
seq2: ((inttype word | booltype word) ',' {w.print(", ");})* (inttype word | booltype word);
mod: 'public' {w.print("public ");} | 'private' {w.print("private ");};
ex: ('extends' {w.print("extends ");} | 'implements' {w.print("implements ");}) words;
st: 'static' {w.print("static ");};
word: WORD {w.print($WORD.text);};
num: NUM {w.print($NUM.text);};
bool: BOOL {w.print($BOOL.text);};
ord: ORD {w.print(" " + $ORD.text + " ");};
lb: '(' {w.print('(');};
rb: ')' {w.print(')');};
lp: '{' {w.print('{');};
rp: '}' {w.print('}');};
tabs[int n]: {for (int i = 0; i < n; i++) w.print('\t');};

WORD: [a-zA-Z_][a-zA-Z0-9_]* ;
NUM: [0-9]+;
BOOL: 'true' | 'false';
ORD: [<>]'='? | '==' | '!=';
WS: [ \n\t\r] -> skip;