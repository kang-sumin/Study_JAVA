package equalsMethodTestCode.equalsPoint;

public class Point {
    //멤버 변수
    int x;
    int y;

    //생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //equals() 메서드 Overriding(재정의)
    public boolean equals(Object obj) {
        Point p = (Point) obj; //객체 obj를 Point 타입으로 다운 캐스팅
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
