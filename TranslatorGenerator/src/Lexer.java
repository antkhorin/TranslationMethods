import java.io.*;
import java.text.ParseException;

class Lexer {

    private InputStream in;
    private int pos;
    private char c;

    Lexer(InputStream in) throws ParseException {
        this.in = in;
    }

    char next() throws ParseException {
        try {
            pos++;
            int i = in.read();
            while (i == ' ') {
                i = in.read();
            }
            if (i == -1 || i == '\n') {
                c = '$';
            } else {
                c = (char)i;
            }
            return c;
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), pos);
        }
    }

    char get() {
        return c;
    }

    int pos() {
        return pos;
    }
}
