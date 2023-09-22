package src.chapter03;

public class Product {

    // 멤버변수
    private String name; // 상품이름
    private double price; // 상품가격
    private int quantity; // 상품재고 수량

    // 생성자
    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getter,setter 메소드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //소멸자
    //권장하지 않음
    // protected void finalize() throws Throwable{
    //     super.finalize();
    // }

    public void description(){
        System.out.println(
            name+"상품의 가격은 "+
            price+"원 이고, 잔여 수량은 "+
            quantity+"개 입니다.");
    }

}
