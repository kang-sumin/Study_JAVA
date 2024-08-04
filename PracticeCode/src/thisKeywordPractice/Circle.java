package thisKeywordPractice;

import java.awt.*;

public class Circle {
    //반지름 멤버 필드
    int radius;

    //생성자
    public Circle(int radius) {
        this.radius = radius;
    }

    //객체 자신 리턴
    public Circle returnInstance(){
        return this;
    }

    //반지름 값을 리턴하는 멤버 메서드
    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(9);

    }
}
