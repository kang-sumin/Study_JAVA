package javaPracticeClass.adventure.wrapper;

public class Main {
    public static void main(String[] args) {

        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(10);

        //캐싱 기능 cache values in thr range -128 to 127
        Integer a1 = Integer.valueOf(1);
        Integer a2 = Integer.valueOf(1);
        boolean ret = (a1 == a2);
        System.out.println("ret : " + ret);


    }

}
