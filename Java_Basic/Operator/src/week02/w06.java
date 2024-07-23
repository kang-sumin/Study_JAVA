package week02;

public class w06 {
    //대입연산자에서 주의해야 할 점
    //++, --
    public static void main(String[] args) {
        int a =10;
        int b=10;
        int val = ++a + b--; //11+10 =21
        System.out.println(val);
        System.out.println(b); //9

    }
}
