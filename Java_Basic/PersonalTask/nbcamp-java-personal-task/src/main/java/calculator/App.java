package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();

        System.out.println(firstNum + "/" + secondNum);
    }
}
