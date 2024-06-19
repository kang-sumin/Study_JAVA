
public class Main {
    public static void main(String[] args) {

        AbstGameConnectHelper abstGameConnectHelper = new ConcreteGameConnectHelper();
        //템플릿 메소드로 호출
        abstGameConnectHelper.requestConnection("info");
    }
}