package com.company;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void character() {
        System.out.println("Kot: "+ getName());
    }
}
