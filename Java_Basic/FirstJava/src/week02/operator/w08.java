package week02.operator;

public class w08 {
    //연산자 우선순위 : 산술>비교>논리>대입
    /*연산자 여러개가 함께 있을 때는 위의 우선순위대로 연산함
     * 단, 괄호로 감싸주면 괄효안의 연산이 최우선순위로 계산된다*/
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result); //true
        System.out.println("--------------------");

        result = x + 10 < y && y < z; //false
        System.out.println(result);

        System.out.println("--------------------");
        result = x + 2 * 3 > y; //false;
        System.out.println(result);

        System.out.println("--------------------");
        result = (x + 2) * 3 > y; //true;
        System.out.println(result);
    }
}
