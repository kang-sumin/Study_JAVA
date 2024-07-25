package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //양의 정수 2개 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();

        //사칙연산 기호 입력
        System.out.print("사칙연산 기호를 입력하세요: ");
        //next()은 Scanner 클래스 메소드로 문자열을 반환하기 때문에 charAt(idx)메소드를 이용해 문자타입으로 변환하여 0번째 문자를 반환
        char operator = sc.next().charAt(0);

        System.out.println(operator);

    }
}
