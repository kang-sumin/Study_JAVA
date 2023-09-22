package src.chapter03;

public class Electronics extends Product {
    
    private String manufacturer; //제조사

    public Electronics(String name, double price, int quantity, String manufacturer) {
        //부모클래스의 생성자 초기화
        //super로 부모의 생성자 호출
        //new Product(name, price, quantity)와 같은 의미임
        super(name, price, quantity);
        //자식클래스의 생성자 초기화
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //오버라이딩
    @Override
    public void description() {
        
        //부모클래스의 description() 메소드 호출함
        super.description();

        //또는 처음부터 재정의 해도됨
        // System.out.println( 
        //     manufacturer +
        //     //부모클래스의 메소드 사용함
        //     getName()+"상품의 가격은 "+
        //     getPrice()+"원 이고, 잔여 수량은 "+
        //     getQuantity()+"개 입니다.");

        System.out.println("참고로, 브랜드는 "+manufacturer);
    }

    //오버로딩
    public void description(boolean detail){
        description();
        System.out.println("이 제품의 리뷰는 좋습니다.");
    }

}
