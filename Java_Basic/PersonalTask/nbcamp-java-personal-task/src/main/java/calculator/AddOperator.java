package calculator;

//더하기 연산
public class AddOperator implements Operator {


    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum + secondNum;

        /*DTO, VO, Entity, Domain(ORM), Model 데이터를 담고 왔다갔다 하는 애들
        * Data transger object 데이터를 받아서 이동하고 다른 곳에 데이터를 넣어준다. getter, setter
        * value object getter(밸류다)
        * Entity : jpa, hibernate
        * Domain*/
    }
}
