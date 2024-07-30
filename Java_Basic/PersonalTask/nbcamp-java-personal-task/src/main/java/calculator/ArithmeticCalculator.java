package calculator;

import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator{

    int firstNum;
    int secondNum;
    char operator;
    double result;


    public ArithmeticCalculator(LinkedList<Double> results) {
        super(results);
    }

    public LinkedList<Double> calculate(int firstNum, int secondNum, char operator) throws DivisionException {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;


        switch (this.operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    throw new DivisionException();
                } else {
                    result = firstNum / secondNum;
                }
                break;
            default:
                System.out.println("연산기호는 사칙연산만 입력가능합니다.");
                break;
        }
        super.getResults().add(result);

        System.out.println(super.getResults().toString()); //확인용 출력

        return super.getResults();
    }
}
