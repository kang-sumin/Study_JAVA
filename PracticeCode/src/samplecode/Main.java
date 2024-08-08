package samplecode;


public class Main {

    // 모험가 클래스 선언
    static class Adventurer {
        String name = "새싹";
        int age = 18;
        int food = 0;

        // 1. 선언: 식량 조회
        int getFood() {
            return food;
        }

        // 2. 식량 추가
        void addFood(int amount) {
            food = food + amount;
        }

        // 메서드 선언: 탐험 메스드
        void explore() {
            System.out.println("::: 시작 - 탐험을 시작합니다.");
            doSomething();
            System.out.println("::: 종료 - 탐험을 종료합니다.");
        }

        // 요구사항 아래 작업을 시작하면 food -1;
        void doSomething() {
            if (food <= 0) {
                System.out.println("움직일 수 없습니다....(현재 식량 개수: " + food + "개)");
            } else {
                food = food - 1;
                System.out.println("탐험 중 ....(남은 식량 개수: " + food + "개)");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 객체를 소환(생성)
        Adventurer gygim = new Adventurer();

        // 호출1: 식량 조회 메서드
        int food = gygim.getFood();
        // 호출된 결과를 출력
        System.out.println("현재 식량: " + food);

        //호출2: 식량 추가
        gygim.addFood(2);
        // 호출
        int updateFood = gygim.getFood();
        System.out.println("업데이트된 식량: " + updateFood);

        // 탐험을 3번
        gygim.explore();
        gygim.explore();
        gygim.explore();

        int f = gygim.getFood();
        System.out.println("------- 남은식량: " + f);
    }
}
