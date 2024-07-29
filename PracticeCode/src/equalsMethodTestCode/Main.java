package equalsMethodTestCode;



public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        boolean result = obj1.equals(obj2);
        System.out.println(result); //서로 주소값이 다르기 때문에 false 출력됨
    }
}
