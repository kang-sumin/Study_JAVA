public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Ainterface를 선언하여 생성해줌(할당함)
        Ainterface ainterface = new AinterfaceImplement();

        //interface는 funcA()를 사용할 수 있는 통로가 됨
        //funcA()를 호출하면서 사용함
        //ainterface.funcA();

        //funcAA라는 기능을 사용하기 위해서 Ainterface의 객체 기능을 호출해서 사용함(위임하여 사용함)
        AObject aObject = new AObject();
        aObject.funcAA();
    }
}