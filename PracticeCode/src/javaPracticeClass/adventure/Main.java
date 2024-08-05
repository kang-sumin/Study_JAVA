package javaPracticeClass.adventure;

public class Main {

    //모험가 클래스 선언
    static class Adventurer {
        //이름
        String name = "홍길동";
        //나이
        int age = 18;
        int food = 0;

        //식량 조회
        int getFood() {
            return food;
        }

        //식량 추가
        void addFood(int amount) {
            food = food + amount;
        }

        //탐험 메서드
        void explore() {
            System.out.println("::: 시작 - 탐험을 시작합니다.");
            doSomething();
            System.out.println("::: 종료 - 탐험을 종료합니다.");
        }

        //탐험 중 식량 감소
        void doSomething() {
            if (food <= 0) {
                System.out.println("움직일 수 없습니다...( 현재 식량 개수 : " + food + " 개)");
            } else {
                food -= 1;
                System.out.println("탐험 중... ( 남은 식량 개수 : " + food + " 개)");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Adventurer adventurer = new Adventurer();

        System.out.println("현재 식량 : " + adventurer.getFood());
        adventurer.addFood(2);
        System.out.println("식량 추가 : " + adventurer.getFood());
        adventurer.explore();
        System.out.println("남은 식량 : " + adventurer.getFood());
    }
}
