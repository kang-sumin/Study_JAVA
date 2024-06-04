//요구사항에 맞춰서 로직 변경하여 구현
public class AdapterImplement implements Adapter{

    @Override
    public Float twiceOf(Float num){

        return (float) Math.towTime(num.doubleValue());
    }

    @Override
    public Float halfOf(Float num){

        return (float) Math.half(num.doubleValue());
    }
}
