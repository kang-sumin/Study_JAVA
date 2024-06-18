//템플릿이 되는 추상 클래스
public abstract class AbstGameConnectHelper {

    //외부에서는 호출되면 안되는데 하위클래스에서는 사용해야하기 때문에 접근지정자를 protected로 지정함
    //AbstGameConnectHelper, ConcreteGameConnectHelper는 실행되는 Main클래스와 다른 패키지에 있어야함
    //패키지를 나눔으로써 라이브러리역할의 패키지와 동작하는 패키지로 나누어 줄 수 있음
    //보안 단계
    protected abstract String doSecurity(String string);
    //인증 단계
    protected abstract boolean authentication(String id, String password);
    //권한 단계
    protected abstract int authorization(String userName);
    //접속 단계
    protected abstract String connection(String info);

    //템플릿 메소드
    //나누어진 알고리즘을 호출 해줌
    public String requestConnection(String str){

        //보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(str);

        //-----------------------------------------------
        //인증단계
        //복호환된 문자열(decodedInfo)에서 아이디, 암호에 추출
        String id = "aaa";
        String password = "bbb";

        //인증
        if(!authentication(id,password)){
            throw new Error("아이디 암호 불일치");
        }
        //-------------------------------------------------
        //권한 단계
        String userName = "홍길동";
        int result = authorization(userName);

        //-------------------------------------------------
        //접속 단계
        switch(result){
            //정책 변경으로 인한 접속 단계 추가
            case -1:
                throw new Error("셧다운");
            case 0://게임 매니저
                break;
            case 1://무료회원
                break;
            case 2://유료회원
                break;
            case 3://접속 권한 없음
                break;
            default://기타사항(확장성을 위해)
                break;
        }

        return connection(decodedInfo);

    }


}
