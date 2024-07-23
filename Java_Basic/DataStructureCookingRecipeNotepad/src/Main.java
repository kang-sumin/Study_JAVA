import java.sql.Struct;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //자료구조 선언 및 생성
        ArrayList<String> strList = new ArrayList<String>();
        LinkedHashSet<String> strSet = new LinkedHashSet<String>();
        Map<Integer, String> strMap = new HashMap<Integer, String>();

        //자료구조 입력
        String structure = sc.nextLine();

        //title 입력
        String title = sc.nextLine();

        String text = "";

        //데이터 삽입
        if (structure.equals("List")) {
            //삽입
            while(!text.equals("끝")){
                text = sc.nextLine();
                if(text.equals("끝"))
                    break;
                strList.add(text);
            }

            //출력
            System.out.println("[ "+structure + " 으로 "+ title +" ]");
            for(int i=0;i<strList.size();i++){
                System.out.println(i+1 +". "+strList.get(i));
            }

        } else if (structure.equals("Set")) {
            //삽입
            while(!text.equals("끝")){
                text = sc.nextLine();
                if(text.equals("끝"))
                    break;
                strSet.add(text);
            }

            //출력
            System.out.println("[ "+structure + " 으로 "+ title +" ]");
            //반복 순회
            Iterator iterator = strSet.iterator();
            for(int i=0;i<strSet.size();i++){
                System.out.println(i+1 +". "+iterator.next());
            }

        } else if (structure.equals("Map")) {
            //삽입
            int count=0;
            while(!text.equals("끝")){
                text = sc.nextLine();
                if(text.equals("끝"))
                    break;
                strMap.put(count++,text);

            }

            //출력
            System.out.println("[ "+structure + " 으로 "+ title +" ]");
            for(int i=0;i< strMap.size();i++){
                System.out.println(i+1 +". "+strMap.get(i));
            }

        } else {
            System.out.println("자료구조명을 다시 입력해 주세요!");
        }

    }
}