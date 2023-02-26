package src;

import java.util.ArrayList;

public class Calculator
{
    private Stack<Token> stack;

    public Calculator()
    {
        this.stack = new LinkedList<>();
    }

    public int evaluateExpression(ArrayList<Token> tokens)
    {
        int result = 0;
        for (int i = 0; i < tokens.size(); i++)
        {
            if (tokens.get(i) instanceof Operand)
            {
                stack.push(tokens.get(i));
            }
            else if (tokens.get(i) instanceof Operator) {
                Operator operator = (Operator) tokens.get(i);
                char op = operator.getOperator();

                Token t1 = stack.pop();
                Operand operand1 = (Operand) t1;
                int value1 = operand1.getValue();

                Token t2 = stack.pop();
                Operand operand2 = (Operand) t2;
                int value2 = operand2.getValue();

                if (op == '*') {
                    result = value2 * value1;
                } else if (op == '/') {
                    result = value2 / value1;
                } else if (op == '+') {
                    result = value2 + value1;
                } else if (op == '-') {
                    result = value2 - value1;
                }

                Operand resultOperand = new Operand(result);
                stack.push(resultOperand);
            }
        }
        return result;
    }
}
