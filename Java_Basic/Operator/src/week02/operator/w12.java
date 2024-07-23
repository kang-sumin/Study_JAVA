package week02.operator;

public class w12 {
    //중첩 if 문
    public static void main(String[] args) {
        boolean flag = true;
        int number = 2;

        if (flag) {
            System.out.println("flag가 true입니다.");
            if (number == 1) {
                System.out.println("1");
            } else if (number == 2) {
                System.out.println("2");
            } else {
                System.out.println("모름");
            }
        } else {
            System.out.println("flag가 false입니다.");
        }
    }
}
