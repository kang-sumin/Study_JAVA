package week03;

/* 클래스를 만들기 위한 STEP 4가지
 *  1. 만들려고 하는 설계도를 선언한다. (클래스 선언)
 *  2. 객체가 가지고 있어야 할 속성(필드)를 정의한다.
 *  3. 객체를 생성하는 방식을 정의한다. (생성자) constructor -> 클래스 이름과 생성자 이름은 같아야 한다.
 *  4. 객체가 가지고 있어야 할 행위(메서드)를 정의한다.*/

public class Car {

    //<필드 영역>

    // 1) 고유 데이터 영역
    String company; //자동차 회사
    String model; //자동차 모델
    String color; //자동차 색
    double price; //자동차 가격

    // 2) 상태 데이터 영역
    double speed; //자동차 속도, km/h
    char gear; //기어상태(P,R,N,D)
    boolean lights; //자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    //<생성자>
    //생성자 -> 클래스 이름과 같아야 함 : 처음 객체가 생성될 때 (instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의.
    public Car() {
        //logic
        //기본생성자 : 아무것도 없는것, 생략가능
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");
    }

    //<메서드 영역>

    //gasPedal
    //input : km/h
    //output : speed
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    //brakePedal
    //input : X
    //output : speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear (char type)
    //output : gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    //onOffLight
    //input : X
    //output : lights (boolean type)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    //horn
    //input : X
    //output : X
    void horn() {
        System.out.println("빵빵~~~~~!!!");
    }


}