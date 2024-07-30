package calculator;

//더하기 연산
public class AddOperator {
    int result;

    public int operate(int firstNum, int secondNum) {
        this.result = firstNum + secondNum;
        return result;
    }
}
