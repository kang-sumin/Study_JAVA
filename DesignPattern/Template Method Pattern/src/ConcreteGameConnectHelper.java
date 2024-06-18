//하위클래스에서 구체적인 구현
public class ConcreteGameConnectHelper extends AbstGameConnectHelper{

    //보안 단계
    @Override
    protected String doSecurity(String string){
        System.out.println("정책변경으로 인한 강화된 알고리즘을 이용한 디코드");
        //System.out.println("디코드");
        return string;
    }

    //인증 단계
    @Override
    protected boolean authentication(String id, String password){
        System.out.println("아이디/암호 확인 과정");
        if(id.equals("aaa")&&password.equals("bbb")){
            return true;
        }
        else{
            return false;
        }
    }

    //권한 단계
    @Override
    protected int authorization(String userName){
        System.out.println("권한 확인");
        /*서버에서 유저이름과 유저 나이를 알 수 있다.
        나이를 확인하고 접속시간을 확인하여 미성년자가 10시이후에 접속한다면 권한이 없는 것으로 한다.
        * */
        return 0;
    }

    //접속 단계
    @Override
    protected String connection(String info){
        System.out.println("마지막 접속 단계");
        return info;
    }

}
