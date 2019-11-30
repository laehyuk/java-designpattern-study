package com.designpattern.strategy;

public class Cow implements AnimalSound {

    @Override
    public void cry() {
        System.out.println("음메~");
    }

}
