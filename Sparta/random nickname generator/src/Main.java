
public class Main {
    public static void main(String[] args) {
        RandomNicknameGenerator randomNicknameGenerator=new RandomNicknameGenerator();
        String nickName = randomNicknameGenerator.createNickname();

        System.out.println(nickName);
    }
}