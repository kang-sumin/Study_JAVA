package week02.array;

import java.util.Arrays;

public class Arr04 {
    //깊은 복사
    public static void main(String[] args) {
//        // 깊은 복사
//        int[] a = {1, 2, 3, 4};
//        int[] b = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i]; // 깊은 복사
//        }
//
//        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)
//        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

//        // 깊은 복사 메서드
//        // 1. clone() 메서드
//        int[] a = {1, 2, 3, 4};
//        int[] b = a.clone(); // 가장 간단한 방법입니다.
//        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!

        // 2. Arrays.copyOf() 메서드
        int[] a = { 1, 2, 3, 4 };
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.

        a[3]=0;
        System.out.println(a[3]);
        System.out.println(b[3]);


    }

}
