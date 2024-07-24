package week03.sample;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());

    }

    //기본 생성자
    //public Main(){}

    //method
    public int getNumber(){
        //지역변수 <-> 전역변수
        /*해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리합니다.
        * 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        * 이 메서드가 종료될 때 소멸된다.*/
        int number = 1;
        number +=1;
        return number;
    }
}
