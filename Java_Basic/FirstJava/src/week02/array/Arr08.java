package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        //배열 안에서 최대값 구하기
        // 최대값 구하기

        int[] arr = { 3, 2, 0, 5, 1 };

        // 최대값 초기값 세팅
        int max = arr[0];

        // 최대값 구하기
        for (int num : arr) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }

        // 최대값 5 출력
        System.out.println(max);

        // 최소값 초기값 세팅
        int min = arr[0];

        // 최소값 구하기
        for (int num : arr) {
            if (num < min) { // 반복문 돌면서 나(min)보다 값이 작으면 저장
                min = num;
            }
        }

        // 최소값 1 출력
        System.out.println(min);
    }
}
