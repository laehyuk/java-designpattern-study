package com.designpattern.templatemethod.connecthelper;

public class EnhancedGameConnectHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity( String string ) {
        System.out.println("강화된 디코드");
        return null;
    }

    @Override
    protected boolean authentication( String id, String password ) {
        System.out.println("강화된 아이디/암호 확인과정");
        return true;
    }

    @Override
    protected int authorization( String userName ) {
        System.out.println("강화된 권한 확인");
        return 0;
    }

    @Override
    protected String connection( String info ) {
        System.out.println("마지막 접속단계!");
        return null;
    }

    @Override
    public String requestConnection( String encodedInfo ) {
        System.out.println("강화된 Connection");
        return super.requestConnection(encodedInfo);
    }
}
