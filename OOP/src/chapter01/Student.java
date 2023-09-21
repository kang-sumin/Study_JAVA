package src.chapter01;

//Student Class
public class Student {

    // 멤버변수
    private String studentId;
    private String name;
    private String major;

    // 생성자
    // 기본생성자
    public Student() {

    }

    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;

    }

    // 메소드
    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    // 변수를 세팅하는 거라서 리턴 타입이 없어서 void로 설정
    public void setStudnetId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}