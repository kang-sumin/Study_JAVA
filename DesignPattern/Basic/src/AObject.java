public class AObject {

    Ainterface ainterface = new AinterfaceImplement();

    public void funcAA(){

        /*많은 기능을 구현해야할때 다른 사람한테 A,B 기능 구현을 맡기고
        또 다른 사람이 C,D 기능을 구현하게 되었을때,
        그 코드들을 복사 붙여넣기로 넣지 않고, interface로 구현하여
        객체를 불러오는 방식으로 구현하는게 좋다.
        수많은 기능이 필요할텐데 각각의 기능을 다 복사 붙여넣기 하기에는
        유지보수가 쉽지 않다
        */

        /*어떤 기능을 구현할때 그 책임을 다른 객체에 떠넘기는것,
         다른 객체의 기능을 사용하는것을 위임함다 라고 한다.
        */
        ainterface.funcA(); //System.out.println("AAA 기능");
        ainterface.funcA(); //System.out.println("AAA 기능");
    }
}
