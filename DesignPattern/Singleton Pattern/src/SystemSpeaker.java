import java.util.PrimitiveIterator;

public class SystemSpeaker {

    // 하나만 생성해 주기 위해서 static으로 선언
    private static SystemSpeaker instance;
    private int volume;

    //생성자 (외부에서 생성자 호출 불가하게 접근 지정자는 private)
    private SystemSpeaker(){
        volume = 5;
    }

    // 외부 접근 위해 static 지정
    public static SystemSpeaker getInstance(){
        // 생성되어 있는 instance가 있는지 확인 하고 없으면 생성해서 리턴 있으면 기존 생성되어 있는 instance를 리턴 함
        if(instance == null) {
            // 실제로는 시스템 스피커와 통신할 수 있는 작업이 들어감
            // 간단한 예제를 위해 여기서는 생성만 함
            instance = new SystemSpeaker();
            System.out.println("새로 생성되었습니다.");
        }else{
            System.out.println("이미 생성되었습니다.");
        }
        return instance;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

}
