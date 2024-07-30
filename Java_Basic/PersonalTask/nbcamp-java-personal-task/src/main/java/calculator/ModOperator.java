package calculator;

public class ModOperator implements Operator{
    int result;

    @Override
    public int operate(int firstNum, int secondNum) {
        this.result = firstNum%secondNum;
        return result;
    }
}
