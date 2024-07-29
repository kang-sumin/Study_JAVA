package calculator;

import java.util.*;

public class DivisionException extends Exception{
    public DivisionException(){
        super("나눈셈 연산에서 분모에 0 이 입력될 수 없습니다.");

    }
}
