package com.designpattern.strategy;

public class Dog implements AnimalSound {

    @Override
    public void cry() {
        System.out.println("멍멍~");
    }

}
