package com.company;

public class Hospital {
    private static final int MAX_EMPLOYEES = 3;
    private Person[] employess = new Person[MAX_EMPLOYEES];
    private int emloyeesNumber = 0;

    void add(Person person) {
        if (emloyeesNumber < MAX_EMPLOYEES) {
            employess[emloyeesNumber] = person;
            emloyeesNumber++;
        } else
            System.out.println("Nie mozna dodac wiecej pracownikow");
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < emloyeesNumber; i++) {
            result = result + employess[i].getInfo() + "\n";
        }
        return result;
    }
}
