package parser;

import java.io.*;
import java.util.*;
import java.text.ParseException;

public class Test {

    private Random random = new Random();
    private StringBuilder string = new StringBuilder();
    private boolean isError;

    public static void main(String[] args) throws Exception {
        new Test().run();
    }

    private void run() {
        Parser parser = new Parser();
        for (int i = 0; i < 100000; i++) {
            string.setLength(0);
            isError = false;
            genS();
            String s = string.toString();
            System.out.println(s);
            try {
                Tree t = parser.parse(new ByteArrayInputStream(s.getBytes()));
                if (isError) {
                    System.out.println("Error not found");
                    System.out.println(s);
                    return;
                }
            } catch (Exception e) {
                if (!isError) {
                    System.out.println("Found non-existent error");
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println("Test passed");
    }

    private void genS() {
        genE();
    }

    private void genE() {
        genT();
        genEPrime();
    }

    private void genEPrime() {
        if (random.nextDouble() < 0.5) {
            error();
            string.append("|");
            genT();
            genEPrime();
        }
    }

    private void genT() {
        genF();
        genTPrime();
    }

    private void genTPrime() {
        if (random.nextDouble() < 0.75) {
            genF();
            genTPrime();
        }
    }

    private void genF() {
        genA();
        genFPrime();
    }

    private void genFPrime() {
        if (random.nextDouble() < 0.2) {
            error();
            string.append("*");
            genFPrime();
        }
    }

    private void genA() {
        if (random.nextDouble() < 0.1) {
            error();
            string.append("(");
            genE();
            error();
            string.append(")");
        } else {
            error();
            string.append((char) ('a' + random.nextInt(26)));
        }
    }

    private void error() {
        for (int i = 0, n = (int) Math.log10(0.01 / random.nextDouble()); i < n; i++) {
            isError = true;
            switch (random.nextInt(9)) {
                case 0:
                    string.append("||");
                    break;
                case 1:
                    string.append("|*");
                    break;
                case 2:
                    string.append("|)");
                    break;
                case 3:
                    string.append("(|");
                    break;
                case 4:
                    string.append(")*");
                    break;
                case 5:
                    string.append("(*");
                    break;
                case 6:
                    string.append("(*)");
                    break;
                case 7:
                    string.append("()");
                    break;
                case 8:
                    string.append((char) (65 + random.nextInt(26)));
                    break;
            }
        }
    }
}
