package parser;

import java.io.*;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String s;
            Parser parser = new Parser();
            while ((s = reader.readLine()) != null) {
                try {
                    Tree t = parser.parse(new ByteArrayInputStream(s.getBytes()));
                    t.print();
                    System.in.read();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
