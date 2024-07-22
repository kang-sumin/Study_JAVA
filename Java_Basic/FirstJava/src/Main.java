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
    * */

    public static void main(String[] args) {

        System.out.println("Our First Porject! :)");
    }
}