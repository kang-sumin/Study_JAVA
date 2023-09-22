package src.chapter02;

public class Main {
    public static void main(String[] args) {
        //객체생성 및 초기화
        // Product a=new Product();
        // a.setName("마우스");
        // a.setPrice(2000);
        // a.setQuantity(100);

        Product a =new Product("마우스", 2000, 100);

        System.out.println(
            a.getName()+"상품의가격은 "+
            a.getPrice()+"원 이고, 잔여 수량은 "+
            a.getQuantity()+"개 입니다.");

    }
    
}
