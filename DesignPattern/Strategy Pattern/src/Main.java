public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //캐릭터 생성
        GameCharacter character = new GameCharacter();

        //무기가 할당되지 않을때
        character.attack();

        //칼 할당
        character.setWeapon(new Knife());
        character.attack();

        //검 할당
        character.setWeapon(new Sword());
        character.attack();

        //도끼 할당
        character.setWeapon(new Ax());
        character.attack();
    }
}