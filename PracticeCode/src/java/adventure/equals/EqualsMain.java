package java.adventure.equals;


import java.util.Objects;

public class EqualsMain {

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

        Map createMap(String terrain, int size) {
            if(0<food){
                food=food-1;
                System.out.println("지도를 만드는 중... (남은 식량 개수 : "+food+"개");
                return new Map(terrain, size);
            }
            return null;
        }

    }

    // 지도 객체 == 클래스 선언
    static class Map {
        String terrain; //지형
        int size; //지도크기

        //생성자 : 조립 설명서
        Map(String terrain, int size) {
            this.terrain = terrain;
            this.size = size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Map map = (Map) o;
            return size == map.size && Objects.equals(terrain, map.terrain);
        }

        @Override
        public int hashCode() {
            return Objects.hash(terrain, size);
        }

    }

    public static void main(String[] args) {
        // 모험가 객체를 소환 == 초기화 == 생성 == 인스턴스화
        Adventurer adventurer = new Adventurer();

        //식량 주머니 3개 만들기
        int a = 1;
        int b = 1;
        int c = 1;

        adventurer.addFood(a + b + c);

        Map mapA = adventurer.createMap("forest",10);
        Map mapB = adventurer.createMap("forest",10);
        Map mapC = adventurer.createMap("desert",10);

        boolean ret = (mapA.equals(mapB));
        System.out.println("지도 비교 결과: "+ret);
    }
}

