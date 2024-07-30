package calculator;

import java.util.*;

public class Calculator {
    private LinkedList<Double> results;

    //원주율 3.14는 절대 변하지 않는 값(상수)이여서 static final 로 선언
    static final double PI = Math.PI;

    //사칙연산 포홤관계
    AddOperator add;
    SubtractOperator sub;
    MultiplyOperator mul;
    DivideOperator div;
    ModOperator mod;

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
