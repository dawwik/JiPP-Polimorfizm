package com.company;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Jan","Kowalski",7000,1500));
        hospital.add(new Nurse("Ania","Witczak",3500,4));
        hospital.add(new Nurse("Joanna","Nowak",3800,8));

        System.out.println("Pracownicy szpitala \n" );
        System.out.println(hospital.getInfo());
    }
}
