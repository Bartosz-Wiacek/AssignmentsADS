package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Token> tokens = new ArrayList<Token>();
        tokens.add(new Operand(2));
        tokens.add(new Operand(3));
        tokens.add(new Operator('*'));
        tokens.add(new Operand(4));
        tokens.add(new Operator('-'));

        Calculator calculator = new Calculator();
        int result = calculator.evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}
