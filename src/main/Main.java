package main;

import calculator.MathCalculator;
import history.ChronologyHistory;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.Printer;


import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        MathCalculator mathCalculator = new MathCalculator(consolePrinter);
        Scanner scanner = new Scanner(System.in);
        ChronologyHistory chronologyHistory = new ChronologyHistory(consolePrinter);
        StringParser stringParser = new StringParser(mathCalculator,scanner,chronologyHistory);

        stringParser.parse();
        scanner.close();
    }
}
