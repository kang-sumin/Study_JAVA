package src.chapter03;

public class Main {
    public static void main(String[] args) {

        // Product a =new Product("마우스", 2000, 100);

        Electronics a=new Electronics("마우스", 2000, 100, "로지텍");

        // System.out.println(
        //     //자식클래스 메소드 사용함
        //     a.getManufacturer()+
        //     //부모클래스의 메소드 사용함
        //     a.getName()+"상품의 가격은 "+
        //     a.getPrice()+"원 이고, 잔여 수량은 "+
        //     a.getQuantity()+"개 입니다.");

        //오버로딩
        a.description();
        a.description(true);
    }
    
}
