package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        LinkedList<Double> results = new LinkedList<>();
        ArithmeticCalculator calc1 = new ArithmeticCalculator(results);
        CircleCalculator calc2 = new CircleCalculator(results);

        String exit = "";
        Scanner sc = new Scanner(System.in); //Scanner 객체 생성


        while (!exit.equals("exit")) {

            int firstNum = -1;
            int secondNum = -1;

            System.out.println("무엇을 계산하시겠습니까? (사칙연산 : 0, 원넓이 계산 : 1)");
            int calcNum = sc.nextInt();
            if (calcNum == 0) {
                System.out.println("<<< 사칙연산 >>>");
                //양의 정수 2개 입력
                while (0 > firstNum) {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    firstNum = sc.nextInt();
                }
                while (0 > secondNum) {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    secondNum = sc.nextInt();
                }

                //사칙연산 기호 입력
                System.out.print("사칙연산 기호를 입력하세요: ");
                //next()은 Scanner 클래스 메소드로 문자열을 반환하기 때문에 charAt(idx)메소드를 이용해 문자타입으로 변환하여 0번째 문자를 반환
                char operator = sc.next().charAt(0);

                //연산 클래스 함수 호출
                try {
                    calc1.calculate(firstNum, secondNum, operator);
                } catch (DivisionException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("연산 완료");
                }
            } else if (calcNum == 1) {
                System.out.println("<<< 원 넓이 계산 >>>");
                System.out.println("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();
                calc2.calculateCircleArea(radius);

            } else {
                System.out.println("잘못입력하셨습니다.");
            }


            //연산 결과값 배열에 저장
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();


            if (remove.equals("remove")) {
                calc1.removeResult();
                System.out.println("삭제되었습니다.");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                calc1.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();


        }


    }
}
