//x만큼 간격이 있는 n개의 숫자
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(-10000000<=x && x<=10000000 && n<=1000){
            for(int i=0;i<n;i++){
                answer[i]=(long)x*(i+1);
            }
            return answer;
        }
        else{
            System.out.println("x는 -10000000~10000000, n은 1000이하의 정수여야 합니다");
            return new long[0];
        }
    }
}