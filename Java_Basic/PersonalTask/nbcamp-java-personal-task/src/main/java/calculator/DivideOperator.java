package calculator;

//나눗셈 연산
public class DivideOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
