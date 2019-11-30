package com.designpattern.strategy;

public class Cat implements AnimalSound {

    @Override
    public void cry() {
        System.out.println("야옹~ 야옹~");
    }

}
