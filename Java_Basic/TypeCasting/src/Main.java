public class Main {
    public static void main(String[] args) {
        /*형 변환 예제 : 변수의 타입을 바꾸는 방법
        * 문자열 -> 숫자
        * 정수 -> 실수
        * 실수 -> 정수
        * */

        //<<<명시적 형 변환>>>
//        //double or float -> int
//        double doubleNumber = 10.101010;
//        float floatNumber = 10.1010f;

//        //double -> int
//        int intNumber;
//        intNumber = (int)doubleNumber;
//        System.out.println("double type : "+doubleNumber);
//        System.out.println("int type : "+intNumber);

//        //float -> int
//        int intNumber;
//        intNumber = (int)floatNumber;
//        System.out.println("float type : "+floatNumber);
//        System.out.println("int type : "+intNumber);

//        //int -> double or float
//        int intNumber =10;
//        double doubleNumber =(double)intNumber;
//        float floatNumber = (float)intNumber;
//
//        System.out.println("double type : "+ intNumber);
//        System.out.println("float type : "+intNumber);

        //<<<암시적 형 변환>>>
        /*변환 타입별 크기 순서
        * byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)*/

//        //byte -> int
//        byte byteNumber =10;
//        int intNumber = byteNumber;
//        System.out.println("int type : "+byteNumber);
//
//        //char(1) ->int(4)
//        char charAlphabet ='A';
//        intNumber = charAlphabet;
//        System.out.println("int type : "+intNumber);
//
//        //int -> long
//        intNumber =100;
//        long longNumber = intNumber;
//        System.out.println("long type : "+longNumber);
//
//        //int -> double
//        intNumber=200;
//        double doubleNubmer = intNumber;
//        System.out.println("double type : "+doubleNubmer);

        //<<<작은 크기의 타입이 큰 크기의 타입과 "계산"될 때, 자동으로 큰 크기의 타입으로 형 변환이 된다.>>>

        //더하기
        int intNumber =10;
        double doubleNubmer=5.5;
        double result = intNumber + doubleNubmer;

        System.out.println("plus : " + result);

        //정수로 나누기
        int iResult = intNumber/4;
        //실수로 나누기
        double dResult = intNumber/4.0;
        System.out.println(iResult + " | "+ dResult);


    }
}