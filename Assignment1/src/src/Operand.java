package src;

public class Operand implements Token
{
    private int operand;

    public Operand(int operand)
    {
        this.operand = operand;
    }

    public int getValue()
    {
        return operand;
    }
}
