package calculator;

//곱셈 연산
public class MultiplyOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}
