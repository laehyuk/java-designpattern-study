package com.designpattern.strategy;

public class Main {

    public static void main( String[] args ) {
        Animal animal = new Animal();

        animal.cry();

        animal.setAnimalSound(new Cat());
        animal.cry();

        animal.setAnimalSound(new Dog());
        animal.cry();

        animal.setAnimalSound(new Cow());
        animal.cry();
    }
}
