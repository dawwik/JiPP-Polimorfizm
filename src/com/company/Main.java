package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Mysz i Kot");
        animals[1] = new Cat("Bonifacy");
        animals[2] = new Mouse("Miki");

        for (Animal animal1 : animals) {
            animal1.sound();

        }
    }
}
