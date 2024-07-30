package calculator;

import java.util.LinkedList;

public class CircleCalculator extends Calculator{
    double radius;
    double result; //연산 결과값

    public CircleCalculator(LinkedList<Double> results) {
        super(results);
    }

    public LinkedList<Double> calculateCircleArea(double radius){
        this.radius=radius;
        result = Math.pow(radius, 2) * PI;
        super.getResults().add(result);
        return super.getResults();
    }
}
