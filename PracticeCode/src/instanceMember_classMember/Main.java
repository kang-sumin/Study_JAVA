package instanceMember_classMember;

public class Main {
    public static void main(String[] args) {
        // 객체 인스턴스 생성 없이 바로 호출(사용)
        // 클래스 필드 COMPANY 확인
        System.out.println(Car.COMPANY + "\n");
        // 클래스 필드 변경 및 확인
        Car.COMPANY = "Audi";
        System.out.println(Car.COMPANY + "\n");

        // 클래스 메서드 호출
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        // 객체 인스턴스 생성하여(참조형 변수) 호출(사용)
        /* 객체 인스턴스를 생성하여 참조형 변수를 사용하여 클래스 멤버에
        * 접근은 가능하지만 추천하지 않습니다.
        * 클래스 멤버는 클래스 이름으로 접근하는 것이 좋습니다.*/
        Car car = new Car(); // 객체 생성

        car.COMPANY = "Ferrari";
        System.out.println(car.COMPANY + "\n");

        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);
    }
}
