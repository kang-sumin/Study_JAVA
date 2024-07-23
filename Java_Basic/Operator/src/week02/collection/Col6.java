package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        /* Map : key-value pair -> 중요
        * key라는 값으로 unique하게 보장이 되어야 함
        * Map -> HashMap, TreeMap으로 응용가능*/

        Map<String, Integer> intMap = new HashMap<String,Integer>();

        //키,값
        intMap.put("일",11);
        intMap.put("이",12);
        intMap.put("삼",13);
        intMap.put("삼",14); //중복 key
        intMap.put("삼",15); //중복 key

        //key 값 전체 출력
        //keySet() : key만 배서 배열로 만드는 함수
        for(String key : intMap.keySet()){
            System.out.println(key);
        }
        //중복된 키는 생략

        for(Integer value : intMap.values()){
            System.out.println(value);
        }
        //마지막으로 쓴 데이터로 덮어쓰기 되었다.

        //키를 입력하여 키를 통해 value값을 출력
        System.out.println(intMap.get("삼"));

    }
}
