package equalsMethodTestCode.Point;

public class Main {
    public static void main(String[] args) {
        //Point 객체 생성
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = a;

        //false
        if (a == b) {
            System.out.println("a==b"); //출력 안됨
        }
        //true
        if (a == c) {
            System.out.println("a==c"); //a==c 출력됨
        }
    }
}
