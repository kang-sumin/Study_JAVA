package calculator;

import java.util.*;

public class Calculator {
    LinkedList<Integer> results = new LinkedList<>();
    int firstNum =0;
    int secondNum =0;
    char operator = 'A';

    public LinkedList<Integer> calculate(int firstNum, int secondNum, char operator) throws DivisionException{
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.operator=operator;
        int result = 0; //사칙연산 결과값

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
        results.add(result);

        return results;
    }

}
