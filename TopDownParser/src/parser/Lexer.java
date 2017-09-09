package parser;

import java.io.*;
import java.text.ParseException;

class Lexer {

    private InputStream is;
    private int curChar;
    private int curPos;
    private Token curToken;

    Lexer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private boolean isLetter(int c) {
        return 'a' <= c && c <= 'z';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos());
        }
    }

    void nextToken() throws ParseException {
        nextChar();
        while (isBlank(curChar)) {
            nextChar();
        }
        switch (curChar) {
            case '?':
                curToken = Token.QUESTION;
                break;
            case '*':
                curToken = Token.STAR;
                break;
            case '|':
                curToken = Token.OR;
                break;
            case '(':
                curToken = Token.LPAREN;
                break;
            case ')':
                curToken = Token.RPAREN;
                break;
            case -1:
                curToken = Token.END;
                break;
            default:
                if (isLetter(curChar)) {
                    curToken = Token.LETTER;
                } else {
                    throw new ParseException("Illegal character " + curChar() + " at position " + curPos(), curPos());
                }
        }
    }

    Token curToken() {
        return curToken;
    }

    int curPos() {
        return curPos;
    }

    String curChar() {
        return Character.toString((char)curChar);
    }
}
