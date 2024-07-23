package week02.operator;

public class w16 {
    //while문
    public static void main(String[] args) {
        int number=0;

        //~하는 동안
        while(number<3){
            number++;
            System.out.println(number+"출력");
        }

        System.out.println("-----------------");
        //do ~ while
        //조건에 맞지 않더라도 최초의 1번은 꼭 수행되어야 하는 로직에 사용
        number=4;
        do{
            //이 로직을 먼저 수행한다.
            System.out.println(number+"출력");

        }while(number<3);

        System.out.println("-----------------");

        // break (깨부수다)
        // 가장 가까운 블록의 for문 or while, switch 문을 중단한다.
        number =0;
        while(number<3){
            number++;
            if(number==2){
                break;
            }
            System.out.println(number+"출력!!!");
        }

        System.out.println("-----------------");
        for(int i=0;i<10;i++){
            System.out.println("i : "+i);
            if(i==2){
                break;
            }
            for(int j=0;j<10;j++){
                System.out.println("j : "+j);
                if(j==2){
                    break;
                }
            }
        }

        System.out.println("-----------------");
        //continue (계속하다)
        number =0;
        while(number<3){
            number++;
            if(number==2){
                continue;
            }
            System.out.println(number+"출력!");
        }

    }
}
