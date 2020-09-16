package com.company;

public class Gym extends BusinessCenter implements Printable{

    private String nameOfGym;
    private int quantity;
    private GymKlass klass; //cardio, weight training

    public Gym(String nameOfGym, int quantity, GymKlass klass) {
        super.getAddress();
        super.getNameOfCenter();
        this.nameOfGym = nameOfGym;
        this.quantity = quantity;
        this.klass = klass;
    }

    @Override
    public void print() {
        System.out.println(getNameOfCenter()+ " " + getAddress() + "\n" + " Тренажерный зал: " + nameOfGym
                + "\n" + " Количество залов: " + quantity + "\n" + " Классификация: " + klass);
        System.out.println("_________________________________________");

    }
}
