import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class RandomNicknameGenerator {

    //랜덤으로 추출할 키워드를 담은 List 생성
    ArrayList<String> firstList = new ArrayList<>(Arrays.asList("기절초풍","멋있는","재미있는"));
    ArrayList<String> secondList = new ArrayList<>(Arrays.asList("도전적인","노란색의","바보같은"));
    ArrayList<String> thirdList = new ArrayList<>(Arrays.asList("돌고래","개발자","오랑우탄"));

    public String createNickname(){

        //랜덤 이름을 담을 리스트 생성
        ArrayList<String> nicknameList = new ArrayList<>();

        //랜덤 변수 생성
        Random random = new Random();
        int randomIndex;

        //첫번째 리스트에서 이름 랜덤 추출
        randomIndex = random.nextInt(firstList.size());
        nicknameList.add(firstList.get(randomIndex));
        //두번째 리스트에서 이름 랜덤 추출
        randomIndex = random.nextInt(secondList.size());
        nicknameList.add(secondList.get(randomIndex));
        //세번째 리스트에서 이름 랜덤 추출
        randomIndex = random.nextInt(thirdList.size());
        nicknameList.add(thirdList.get(randomIndex));

        //생성된 랜덤 이름 리스트를 문자열로 변환하여 반환할 변수 생성
        String nickName = String.join(" ",nicknameList);

        return nickName;
    }

}
