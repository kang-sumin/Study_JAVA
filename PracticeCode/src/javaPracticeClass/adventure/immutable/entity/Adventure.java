package javaPracticeClass.adventure.immutable.entity;

public class Adventure {
    String name = "새싹";
    Artifact artifact;

    //유물을 가져오는 메서드
    public void takeArtifact(Artifact artifact){
        this.artifact = artifact;
    }
}
