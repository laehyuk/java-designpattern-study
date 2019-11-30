package com.designpattern.strategy;

public class Animal {

    private AnimalSound animalSound;

    public void setAnimalSound(AnimalSound animalSound) {
        this.animalSound = animalSound;
    }

    public void cry(){
        if(animalSound == null){
            System.out.println("동물이 없어요");
        }else {
            animalSound.cry();
        }
    }
}
