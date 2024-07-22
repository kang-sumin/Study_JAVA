//클래스
//public : 제어자, public(공공의, 공통의)

public class Main {

    /* JDK 역할
    * 1) compiler : .java -> .class
    * 2) JRE
    * 3) JDB : 디버깅
    * */

    /* main 메소드
    * 자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    * = JVM 약속
    * static : 이 프로그램이 시작될 때 무조건 실행되는 녀석
    *
    * <<output>>
    * void : 메서드의 출력값의 데이터 타입
    * void : 아무것도 없다 -> 출력이 없다
    *
    * <<input>>
    * String[] args : 매개변수 자리
    * String[] : input 타입
    * args : 변수명
    * */

    public static void main(String[] args) {

        // 객체 : 모든것-> 특징(속성, 변수), 행동(메소드)
        /* print -> 줄 바꿈을 하지 X
        *  println -> 줄 바꿈 O
        *  ln : line
        *  */
        System.out.print("Our First Porject! :) ");
        System.out.println("Project :)");

        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");


    }
}