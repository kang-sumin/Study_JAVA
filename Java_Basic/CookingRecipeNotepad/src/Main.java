/*요리 레시피 메모장 만들기
입력값

내가 좋아하는 요리 제목을 먼저 입력합니다.
요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5)
이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.

출력값

입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
이어서, 요리 별점을 소수점을 제외한 정수로만 출력해 줍니다. (ex. 3)
바로 뒤에 정수 별점을 5점 만점 퍼센트로 표현했을 때 값을 실수로 출력해 줍니다. (ex. 60.0%)
이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력해 줍니다.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력받을 스캐너 생성
        Scanner sc = new Scanner(System.in);

        //입력
        String title = sc.nextLine();
        String rate = sc.nextLine();
        String recipe1 = sc.nextLine();
        String recipe2 = sc.nextLine();
        String recipe3 = sc.nextLine();
        String recipe4 = sc.nextLine();
        String recipe5 = sc.nextLine();
        String recipe6 = sc.nextLine();
        String recipe7 = sc.nextLine();
        String recipe8 = sc.nextLine();
        String recipe9 = sc.nextLine();
        String recipe10 = sc.nextLine();

        //별점
        double tempNumber = Double.parseDouble(rate);
        int starNumber = (int)tempNumber;
        //퍼센트
        double percent = starNumber * 100/5;

        //출력
        System.out.println("[ " + title + "]");
        System.out.println("별점 : "+ starNumber + "("+percent+"%)");
        System.out.println("1. "+recipe1);
        System.out.println("2. "+recipe2);
        System.out.println("3. "+recipe3);
        System.out.println("4. "+recipe4);
        System.out.println("5. "+recipe5);
        System.out.println("6. "+recipe6);
        System.out.println("7. "+recipe7);
        System.out.println("8. "+recipe8);
        System.out.println("9. "+recipe9);
        System.out.println("10. "+recipe10);





    }
}