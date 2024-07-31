package parser;

import calculator.Calculator;
import history.History;
import operator.Operator;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StringParser implements Parser{

    private final Calculator calculator;
    private final Scanner scanner;
    private final History history;


    public StringParser(Calculator calculator, Scanner scanner, History history) {
        this.calculator = calculator;
        this.scanner = scanner;
        this.history = history;
    }

    @Override
    public void parse() {
        String stringToCalculate = scanner.nextLine();
        LocalDateTime localDateTime = java.time.LocalDateTime.now();
        String[]operands = stringToCalculate.split(" ");

        String firstOperand = operands[0];
        String secondOperand = operands[2];
        String operatorString = operands[1];

        Operator operator = Operator.findByString(operatorString);
        Double first = Double.parseDouble(firstOperand);
        Double second = Double.parseDouble(secondOperand);

        calculator.calculate(first,second,operator);
        history.addMathOperation(stringToCalculate + " решено "+ localDateTime);
    }
}
