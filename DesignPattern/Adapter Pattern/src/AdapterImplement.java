//요구사항에 맞춰서 로직 변경하여 구현
public class AdapterImplement implements Adapter{

    //2배 구하는 함수 구현
//    @Override
//    public Float twiceOf(Float num){
//
//        return (float) Math.towTime(num.doubleValue());
//    }

    //새로 강화된 2배 구하는 함수 구현
    @Override
    public Float twiceOf(Float num){

        return Math.doubled(num.doubleValue()).floatValue();
    }


    //절반 구하는 함수 구현 + 로그 기능 추가
    @Override
    public Float halfOf(Float num){
        System.out.println("log : 절반 함수 호출");
        return (float) Math.half(num.doubleValue());
    }
}
