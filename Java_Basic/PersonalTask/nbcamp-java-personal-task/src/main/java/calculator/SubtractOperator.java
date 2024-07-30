package calculator;

//빼기 연산
public class SubtractOperator {
    int result;

    public int operate(int firstNum, int secondNum) {
        this.result = firstNum - secondNum;
        return result;
    }
}
