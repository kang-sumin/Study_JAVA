package javaPracticeClass.adventure.immutable.entity;

public class Artifact {

    //final 키워드 추가로 불변객체 만들기
    public final int data;

    //클래스 조립설명서 == 생성자
    public Artifact(int data) {
        this.data = data;
    }
}
