package week02;

import java.util.Scanner;

public class w17 {
    //구구단
    public static void main(String[] args) {
        //입력받은 단 출력
        Scanner sc = new Scanner(System.in);
        //출력할 구구단
        int passNum = sc.nextInt();

        for(int i=2;i<=9;i++){
            if(i==passNum){
                for(int j=2;j<=9;j++){
                    System.out.println(i+" * "+j+" = "+(i*j));
                }
            }

        }
    }
}
