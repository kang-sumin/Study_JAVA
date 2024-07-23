package week02.operator;

public class w15 {
    //반복문 for문
    public static void main(String[] args) {
        //(초기값 ; 조건문 ;증가연산)
        for (int i = 0; i < 4; i++) {
            System.out.println(i+"번째 출력");
        }

        //향상된 for문
        //기존 : for문 안에 3개의 표현이 들어감 -> (초기값 ; 조건문 ; 증가연산)
        //향상된 for 문 : 2개로 줄여줌
        int[] numbers={3,6,9,12,15};
        for(int number:numbers){
            System.out.print(number + " ");
        }
        System.out.println("---------------");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
