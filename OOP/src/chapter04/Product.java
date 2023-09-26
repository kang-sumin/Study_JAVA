package src.chapter04;

public abstract class Product {
    protected String name;
    protected double price;

    //생성자
    public Product(){

    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //상품을 설명하게 할때 사용하는 메소드
    public abstract String toString();
    //추상클래스에서 인터페이스 없이 구현도 가능함
    // public abstract double sell(int quantity);
}
