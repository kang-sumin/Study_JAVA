//약수의 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        //제한 사항
        if(0<=n && n<=3000){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    answer+=i;
                }
            }
            return answer;
        }
        else{
            System.out.println("n은 0~3000이하의 정수여야 합니다.");
            return 0;
        }
    }
}