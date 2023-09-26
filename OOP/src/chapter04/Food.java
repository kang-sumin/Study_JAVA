package src.chapter04;

public class Food extends Product implements Sellable {

    private String expiryDate; // 유통기한

    // 생성자
    public Food(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + "(Price: " + price + ", Expiry Date: " + expiryDate + ")";
    }

    @Override
    public double sell(int quantity) {
        //3개 이상사면 80% 할인
        if(quantity>3) return price*quantity*0.8;
        return price * quantity;
    }

}
