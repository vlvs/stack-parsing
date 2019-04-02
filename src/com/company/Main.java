package com.company;

public class Main {

    public static void main(String[] args) {
        Parsing check = new Parsing();
        check.printExpressionCheck("{A+B(C*Y/X}");
        check.printExpressionCheck("[X+4(9*Y)+3*{2/Z}]");
    }
}
