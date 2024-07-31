package instanceMember_classMember;

public class Car {

    //클래스 필드 멤버
    static String COMPANY = "GENESIS";  //자동차 회사

    //인스턴스 필드 멤버
    String model;   //자동차 모델
    String color;   //자동차 색상
    double price;   //자동차 가격
    double speed;   // 자동차 속도 , km/h
    char gear;  // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    //클래스 메서드 멤버
    //자동차 회사 변경 클래스 메서드
    static String setCompany(String companyName) {
        // System.out.println("자동차 모델 확인: " + model); // 인스턴스 필드 사용 불가
        COMPANY = companyName;
        return COMPANY;
    }

    //인스턴스 메서드 멤버
    String getCompany() {
        //인스턴스 메서드에서는 클래스 멤버 사용가능
        return "(주)" + COMPANY;
    }

    void horn() {
        System.out.println("빵빵");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }
}
