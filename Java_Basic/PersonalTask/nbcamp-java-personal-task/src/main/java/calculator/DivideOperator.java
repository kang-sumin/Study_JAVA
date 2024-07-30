package calculator;

//나눗셈 연산
public class DivideOperator {
    int result;

    public int operate(int firstNum, int secondNum) {
        this.result = firstNum / secondNum;
        return result;
    }
}
