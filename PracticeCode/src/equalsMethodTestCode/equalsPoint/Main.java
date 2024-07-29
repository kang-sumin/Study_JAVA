package equalsMethodTestCode.equalsPoint;

public class Main {
    public static void main(String[] args) {
        //Point 객체 생성
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);

        //false
        if (a == b) {
            System.out.println("a==b"); //주소가 달라서 출력 안됨
        }
        //true
        if (a.equals(b)) {
            System.out.println("a와 b의 내용은 같습니다."); //내용값이 같아서 출력됨
        }
        //false
        if (a.equals(c)) {
            System.out.println("a와 c의 내용은 다릅니다.");//내용값이 달라서 출력안됨
        }
    }
}
