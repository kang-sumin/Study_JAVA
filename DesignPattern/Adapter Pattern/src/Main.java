public class Main {
    public static void main(String[] args) {

        //Adapter를 선언하여 생성해줌
        Adapter adapter = new AdapterImplement();

        //2배
        System.out.println(adapter.twiceOf(100f));
        //절반
        System.out.println(adapter.halfOf(100f));
    }
}