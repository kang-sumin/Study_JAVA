package calculator;

//더하기 연산
public class AddOperator implements Operator {
    int result;

    @Override
    public int operate(int firstNum, int secondNum) {
        this.result = firstNum + secondNum;
        return result;
    }
}
