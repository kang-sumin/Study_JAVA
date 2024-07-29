package calculator;

import java.util.*;

public class Calculator {
    private LinkedList<Integer> results;
    int firstNum = 0;
    int secondNum = 0;
    char operator = 'A';

    //생성자
    public Calculator(LinkedList<Integer> results) {
        this.results = results;
    }

    //Getter
    public LinkedList<Integer> getResults() {
        return this.results;
    }

    //Setter
    public void setResults(LinkedList<Integer> results) {
        this.results = results;
    }

    public LinkedList<Integer> calculate(int firstNum, int secondNum, char operator) throws DivisionException {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
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
        this.results.add(result);

        System.out.println(results.toString()); //확인용 출력

        return results;
    }

    //저장된 첫번째 데이터 삭제 메서드
    public void removeResult(){
        this.results.removeFirst();
    }

}
