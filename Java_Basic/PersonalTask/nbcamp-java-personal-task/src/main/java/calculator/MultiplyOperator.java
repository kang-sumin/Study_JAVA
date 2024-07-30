package calculator;

//곱셈 연산
public class MultiplyOperator {
    int result;

    public int operate(int firstNum, int secondNum) {
        this.result = firstNum * secondNum;
        return result;
    }
}
