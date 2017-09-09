package parser;

import java.io.*;
import java.text.ParseException;

class Parser {

    private Lexer lex;

    Tree parse(InputStream in) throws ParseException {
        lex = new Lexer(in);
        lex.nextToken();
        return S();
    }

    private Tree S() throws ParseException {
        Tree tree = new Tree("S");
        switch (lex.curToken()) {
            case LETTER:
            case LPAREN:
                tree.add(E());
            case END:
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        if (lex.curToken() == Token.END) {
            return tree;
        } else {
            throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
    }

    private Tree E() throws ParseException {
        Tree tree = new Tree("E");
        switch (lex.curToken()) {
            case LETTER:
            case LPAREN:
                tree.add(T());
                tree.add(EPrime());
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree EPrime() throws ParseException {
        Tree tree = new Tree("E'");
        switch (lex.curToken()) {
            case OR:
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                tree.add(T());
                tree.add(EPrime());
            case END:
            case RPAREN:
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree T() throws ParseException {
        Tree tree = new Tree("T");
        switch (lex.curToken()) {
            case LETTER:
            case LPAREN:
                tree.add(F());
                tree.add(TPrime());
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree TPrime() throws ParseException {
        Tree tree = new Tree("T'");
        switch (lex.curToken()) {
            case LETTER:
            case LPAREN:
                tree.add(F());
                tree.add(TPrime());
            case OR:
            case END:
            case RPAREN:
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree F() throws ParseException {
        Tree tree = new Tree("F");
        switch (lex.curToken()) {
            case LETTER:
            case LPAREN:
                tree.add(A());
                tree.add(FPrime());
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree FPrime() throws ParseException {
        Tree tree = new Tree("F'");
        switch (lex.curToken()) {
            case STAR:
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                tree.add(FPrime());
                break;
            case QUESTION:
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                tree.add(FPrime());
            case LETTER:
            case LPAREN:
            case OR:
            case END:
            case RPAREN:
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
        }
        return tree;
    }

    private Tree A() throws ParseException {
        Tree tree = new Tree("A");
        switch (lex.curToken()) {
            case LETTER:
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                break;
            case LPAREN:
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                tree.add(E());
                if (lex.curToken() != Token.RPAREN) {
                    throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());
                }
                tree.add(new Tree(lex.curChar()));
                lex.nextToken();
                break;
            default:
                throw new ParseException("Unexpected character " + lex.curChar() + " at position " + lex.curPos(), lex.curPos());

        }
        return tree;
    }
}
