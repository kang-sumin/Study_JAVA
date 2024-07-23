package week02.array;

import java.util.Arrays;

public class Arr05 {
    public static void main(String[] args) {
        //문자(Char) : 기본형 변수, 문자열(String) : 참조형 변수
        //String = char[]

        /*기본형 변수 vs 참조형 변수
        * 1. 기본형 변수는 '소문자로 시작함', 참조형 변수는 '대문자로 시작함'
        *   - Wrapper class에서 기본형 변수를 감사줄 때(boxing), int -> Integer
        * 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 저장 공간에 값을 저장 후 그 주소를 저장함 (= 주소형 변수)
        * */

        /*char < String 훨씬 더 많이 사용
        * String이 가지고 있는 기능이 많아서
        * Wrapper class와도 비슷함 -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로써 추가기능을 사용함*/

        //String 기능 활용 예시
        String str ="ABCD";

        //(1) length
        int strLength = str.length();
        System.out.println(strLength); //4

        //(2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar); //B

        //(3) substring(int fromIndex, int toIndex)
        String strSub = str.substring(0,3);
        System.out.println(strSub); //ABC

        //(4) equals(String str)
        String newStr="ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);//true

        //(5) tocharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();
        System.out.println(Arrays.toString(strCharArray));

        //(6) 반대로 char[] -> String
        char[] charArray ={'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);


    }
}
