package week02.operator;

public class w11 {
    //조건문
    public static void main(String[] args) {

        boolean flag = true;

        if (flag) {
            System.out.println("값이 true입니다.");
        } else {
            System.out.println("값이 false입니다.");
        }

        if (1 != 1) {
            System.out.println("true");
        } else if (1 > 3) {
            System.out.println("1>3");
        } else {
            System.out.println("false");
        }
    }
}
