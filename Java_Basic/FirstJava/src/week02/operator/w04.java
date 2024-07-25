package week02.operator;

public class w04 {
    //논리연산
    //비교연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
    // 조건을 연결하였을 때 boolean 값들을 조합하여 참(true) 또는 거짓(false) 값인 boolean 값을 출력
    // &&(AND) , ||(OR), !(NOT)
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        //OR : 피연산자 중 하나라도 true 이면 true
        System.out.println("-----------------------");
        System.out.println(flag1 || flag2); //true
        System.out.println(flag1 || flag2 || flag3); //true

        //AND : 피연산자 모두 true여야 true
        System.out.println("-----------------------");
        System.out.println(flag1 && flag2); //true
        System.out.println(flag1 && flag2 && flag3);//false

        //AND
        System.out.println("-----------------------");
        System.out.println((5 > 3) && (3 > 1));//true
        System.out.println((5 > 3) && (3 < 1));//false

        //OR
        System.out.println("-----------------------");
        System.out.println((5 > 3) || (3 > 1));//true
        System.out.println((5 > 3) || (3 < 1));//true
        System.out.println((5 < 3) || (3 < 1));//false

        //NOT
        System.out.println("-----------------------");
        System.out.println(!flag1); //false
        System.out.println(!flag3); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true

    }
}
