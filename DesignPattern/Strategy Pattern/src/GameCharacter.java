public class GameCharacter {

    //접근점 생성
    private Weapon weapon;

    //setWeapon() 함수를 통해 교환 가능
    public void setWeapon(Weapon weapon){
        this.weapon=weapon;
    }

    public int attack(){
        if(weapon==null){
            System.out.println("맨손 공격");
        }
        else{
            //델리게이트
            //어떤 무기를 들고 있는지는 Weapon 객체가 알아서 바꿔주고
            //게임 캐릭터는 그냥 공격만 하게된다
            weapon.doAttack();
        }
        return 0;
    }
}
