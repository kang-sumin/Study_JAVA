//나누어 떨어지는 숫자 배열

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        //배열 크기 지정할 count 변수 생성
        int count = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        //배열 생성
        int[] answer = new int[count];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        Arrays.sort(answer);
        return answer;

    }
}