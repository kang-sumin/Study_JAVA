package javaPracticeClass.adventure.wrapper;

public class IntBox {

    final int value;

    public IntBox(int value) {
        this.value = value;
    }

    public IntBox increment(int add){
//        this.value = this.value+add;
        return new IntBox(this.value + add);
    }
}
