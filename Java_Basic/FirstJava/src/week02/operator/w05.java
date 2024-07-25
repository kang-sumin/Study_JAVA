package week02.operator;

public class w05 {
    //대입연산자
    //변수를 연산해서 그 자리에서 저장하는(대입하는) 연산자
    //=(기본대입연산자), +=, -=, *=... (복합대입연산자)
    //++ : +=1
    //-- : -=1
    public static void main(String[] args) {
        //기본대입 연산자
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        //복합대입연산자
        System.out.println("-----------------------");
        number = 10;
        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);

        //++, --
        System.out.println("-----------------------");
        number++; //number =number +1
        System.out.println(number);
        number--; //number = number -1;
        System.out.println(number);

    }

}
