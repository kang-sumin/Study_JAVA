package calculator;

//빼기 연산
public class SubtractOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
