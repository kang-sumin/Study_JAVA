package javaPracticeClass.adventure.immutable.dungeon;

import javaPracticeClass.adventure.immutable.ImmutableMain;
import javaPracticeClass.adventure.immutable.entity.Adventure;
import javaPracticeClass.adventure.immutable.entity.Artifact;

public class Dungeon {
    //멤버 변수
    public Labyrinth labyrinth;

    //던전 조립설명서 == 생성자
    public Dungeon(Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }

    //멤버 메서드
    public Artifact enterDungeon(Adventure adventure) {
        Artifact artifact = labyrinth.navigate(adventure);
        //artifact.data += ImmutableMain.UNKOWN_FORCE;
        return artifact;
    }
}
