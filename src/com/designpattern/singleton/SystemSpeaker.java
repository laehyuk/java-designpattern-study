package com.designpattern.singleton;

/**
 * 시스에서 스피커 접근 할 수 있는 클래스를 만들어주세요.
 */

public class SystemSpeaker {

    static private SystemSpeaker instance;

    private int volumne;

    private SystemSpeaker() {
        volumne = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolumne() {
        return volumne;
    }

    public void setVolumne( int volumne ) {
        this.volumne = volumne;
    }
}
