package javaPracticeClass.adventure.immutable.dungeon;

import javaPracticeClass.adventure.immutable.ImmutableMain;
import javaPracticeClass.adventure.immutable.entity.Adventure;
import javaPracticeClass.adventure.immutable.entity.Artifact;

public class Labyrinth {

    //연결변수
    public Chamber chamber;

    public Labyrinth(Chamber chamber){
        this.chamber = chamber;
    }

    // 길 찾는 메서드
    public Artifact navigate(Adventure adventure){
        Artifact artifact= chamber.findArtifact(adventure);
        //artifact.data += ImmutableMain.UNKOWN_FORCE;
        return artifact;
    }
}
