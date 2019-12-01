package com.designpattern.templatemethod.connecthelper;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity( String string );

    protected abstract boolean authentication( String id, String password );

    protected abstract int authorization( String userName );

    protected abstract String connection( String info );

    //template method
    public String requestConnection( String encodedInfo ) {

        //보안작업-> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        //반환된 것을 가지고 id, password를 할당한다.
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디, 암호 불일치");
        }

        String userName = "userName";
        int auth = authorization(userName);

        switch (auth) {
            case 0://게임매니저
                break;
            case 1://유료회원
                break;
            case 2://무료회원
                break;
            case 3://권한없음
                break;
            default://기타상황
                break;
        }

        return connection(decodedInfo);
    }

}
