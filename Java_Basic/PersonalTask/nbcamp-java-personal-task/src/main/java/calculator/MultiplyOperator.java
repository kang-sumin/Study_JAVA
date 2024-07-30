package calculator;

//곱셈 연산
public class MultiplyOperator implements Operator {
    int result;

    @Override
    public int operate(int firstNum, int secondNum) {
        this.result = firstNum * secondNum;
        return result;
    }
}
