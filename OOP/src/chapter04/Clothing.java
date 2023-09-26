package src.chapter04;

public class Clothing extends Product implements Sellable {

    private String size; // 옷 사이즈

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return name + "(Price: " + price + ", Size: " + size + ")";
    }

    @Override
    public double sell(int quantity) {
        return price * quantity;
    }

}
