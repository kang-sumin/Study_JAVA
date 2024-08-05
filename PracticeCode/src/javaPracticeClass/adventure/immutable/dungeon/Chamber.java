package javaPracticeClass.adventure.immutable.dungeon;

import javaPracticeClass.adventure.immutable.entity.Adventure;
import javaPracticeClass.adventure.immutable.entity.Artifact;

public class Chamber {
    //변수
    //유물
    private final Artifact artifact = new Artifact(1);

    //메서드
    public Artifact findArtifact(Adventure adventure){
//        adventure.takeArtifact(artifact);
        return artifact;
    }


}
