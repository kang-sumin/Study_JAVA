import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //main method : 우리의 playground!

        //기본 변수
        /* (1) boolean
        * 변수를 선언 -> 타입 이름 = 값 (할당);
        * */
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);

        /* (2) 문자형 (char)*/
        char alphabet ='A';
        System.out.println(alphabet);

        /* (3) 정수형 (byte, short, int long)*/
        byte byteNumber =127; //-128 ~ 127 (1byte)
        short shortNumber = 32767; //-32,768 ~ 32,767
        int intNumber = 2147483647;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        /* (4) 실수형
        * float(4byte)
        * double(8byte)*/
        float floatNumber = 0.123F;
        double doubleNumber = 0.123123132;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        //참조형 변수
        /* (5) 문자형 변수
        * */
        String helloWorld ="Hello world!";
        System.out.println(helloWorld);

        /* (6) 배열 */
        int[] a ={1,2,3};
        System.out.println(Arrays.toString(a));

        /* (7) 래퍼 클래스 (Wrapper Class 변수)*/
        int number =21;
        Integer num = number; //boxing

        System.out.println(num.intValue()); //unboxing


    }
}