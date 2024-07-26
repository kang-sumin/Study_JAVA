package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Scanner 객체 생성
        LinkedList<Integer> results = new LinkedList<>();
        String exit = "";
        String remove ="";

        while(!exit.equals("exit")){
            int result = 0; //사칙연산 결과값

            //양의 정수 2개 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            //사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            //next()은 Scanner 클래스 메소드로 문자열을 반환하기 때문에 charAt(idx)메소드를 이용해 문자타입으로 변환하여 0번째 문자를 반환
            char operator = sc.next().charAt(0);

            //연산 기호 구분 제어문
            switch (operator) {
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
                    if(secondNum==0){
                        System.out.println("나눈셈 연산에서 분모에 0 이 입력될 수 없습니다.");
                    }else{
                        result = firstNum / secondNum;
                    }
                    break;
                default:
                    System.out.println("연산기호는 사칙연산만 입력가능합니다.");
                    break;
            }

            //연산 결과 출력
            System.out.println("결과 : " + result);

            //연산 결과값 배열에 저장
            results.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            remove=sc.next();

            if(remove.equals("remove")){
                results.removeFirst();
                System.out.println("삭제되었습니다.");
            }
            System.out.println(results);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();


        }


    }
}
