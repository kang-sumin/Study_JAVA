package calculator;

import java.util.*;

public class Calculator {
    private LinkedList<Double> results;
    //private LinkedList<Double> cresults;
    int firstNum = 0;
    int secondNum = 0;
    char operator = 'A';
    double radius =0;
    double result = 0; //사칙연산 결과값

    //원주율 3.14는 절대 변하지 않는 값(상수)이여서 static final 로 선언
    static final double PI = 3.14;

    //생성자
    public Calculator(LinkedList<Double> results) {
        this.results = results;
    }

    //Getter : 사칙연산 컬렉션
    public LinkedList<Double> getResults() {
        return this.results;
    }

    //Setter : 사칙연산 컬렉션
    public void setResults(LinkedList<Double> results) {
        this.results = results;
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
        this.results.add(result);

        System.out.println(results.toString()); //확인용 출력

        return results;
    }

    public LinkedList<Double> calculateCircleArea(double radius){
        this.radius=radius;
        result = Math.pow(radius, 2) * PI;
        this.results.add(result);
        return results;
    }

    //저장된 첫번째 데이터 삭제 메서드
    public void removeResult() {
        this.results.removeFirst();
    }

    public void inquiryResults() {
        System.out.print("[ ");
        for (double data : this.results) {
            System.out.print("\"" + data + "\" ");
        }
        System.out.print("]\n");
    }

}
