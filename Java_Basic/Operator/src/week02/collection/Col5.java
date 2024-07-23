package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        /*set
        * 집합 : 순서없고, 중복없음
        * 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        * set -> 그냥 쓸 수 있음
        * 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용가능
        * Set 은 생성자가 없는 껍데기라서 바로 생성할 수 없음
        * 생성자가 존재하는 HashSet을 이용해서 -> Set 구현 가능*/

        //선언 및 생성
        Set<Integer> intSet = new HashSet<Integer>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for(Integer value:intSet){
            System.out.println(value);
        }

        //contains : 해당 요소가 존재하는지 확인
        System.out.println(intSet.contains(2)); //false
        System.out.println(intSet.contains(5)); //true

    }
}
