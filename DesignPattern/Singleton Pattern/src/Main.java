public class Main {
    public static void main(String[] args) {

        // new로 생성안됨 -> 생성자가 private이라서
        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        // 5, 5
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        // 10, 10
        systemSpeaker1.setVolume(10);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        if(systemSpeaker1 == systemSpeaker2){
            System.out.println("두 객체는 같은 객체 입니다.");
        }else{
            System.out.println("두 객체는 다른 객체 입니다.");
        }

    }
}