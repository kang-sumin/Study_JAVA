package javaPracticeClass.adventure.immutable;

import javaPracticeClass.adventure.immutable.dungeon.Chamber;
import javaPracticeClass.adventure.immutable.dungeon.Dungeon;
import javaPracticeClass.adventure.immutable.dungeon.Labyrinth;
import javaPracticeClass.adventure.immutable.entity.Adventure;
import javaPracticeClass.adventure.immutable.entity.Artifact;

public class ImmutableMain {

    //클래스 변수
    public static int UNKOWN_FORCE = 1;

    public static void main(String[] args) {


        Chamber chamber = new Chamber();
        Labyrinth labyrinth = new Labyrinth(chamber);

        //던전 소환 (던전 인스턴스 화)
        Dungeon dungeon = new Dungeon(labyrinth);

        //모험가 인스턴스화
        Adventure adventure = new Adventure();
        Artifact artifact = dungeon.enterDungeon(adventure);

        System.out.println("유물 데이터 확인 : "+artifact.data);

        //StringPool\
        //1. 리터럴 선언방식 -> StringPool에 저장된걸 들고온다.
        String strA = "world";
        String strB = "world";

        //2. new 연산자 방식 -> heap 영역에 저장됨
        String strC = new String("world");
        String strD = new String("world");

        System.out.println(strA == strB);
        System.out.println(strC == strD);

        System.out.println(strB == strC);
    }
}
