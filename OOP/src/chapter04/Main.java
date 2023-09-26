package src.chapter04;

public class Main {
    public static void main(String[] args) {
        //추상클래스틑 인스턴스화 할 수 없다

        Food f=new Food("Milk", 1000, "2025-01-01");
        Clothing c=new Clothing("Black T", 15000, "M");
        //인터페이스로 선언하여 객체를 생성해 줄수도 있다
        Sellable s=new Food("Black Milk",2000,"2026-01-01");

        System.out.println(f.toString());
        System.out.println(c.toString());
        System.out.println(s.sell(10));
        System.out.println(f.sell(10));
        System.out.println(f.sell(2));
    }
    
}
