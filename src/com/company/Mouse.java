package com.company;

class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Mysz: "+ getName());
    }
}
