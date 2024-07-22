// 숫자 -> 문자
//import : im(in) + port(항구)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //문자 -> 숫자
        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.

        System.out.println(ch);

        //숫자 -> 문자
        char letter = sc2.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        int asciiNumber2 = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

        System.out.println(asciiNumber2);
    }

}