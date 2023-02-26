package src;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CalculatorTest
{
    private Calculator calculator;

    @Test
    public void testSimpleAddition() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(2));
        tokens.add(new Operand(3));
        tokens.add(new Operator('+'));
        Calculator calculator = new Calculator();
        int result = calculator.evaluateExpression(tokens);
        assertEquals(5, result);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidToken() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(2));
        tokens.add(new Operator('$'));
        int result = calculator.evaluateExpression(tokens);
    }

    @Test(expected = NullPointerException.class)
    public void testMissingOperand() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operator('*'));
        int result = calculator.evaluateExpression(tokens);
    }

    @Test(expected = NullPointerException.class)
    public void testMissingOperator() {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(2));
        tokens.add(new Operand(3));
        int result = calculator.evaluateExpression(tokens);
    }

}
