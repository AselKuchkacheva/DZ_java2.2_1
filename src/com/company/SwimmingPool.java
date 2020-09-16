package com.company;

public class SwimmingPool extends BusinessCenter implements Printable{

    private String nameOfSwimmingPool;
    private int quantity;
    private SwimmingPoolCategory category; //sports, medicinal, individual

    public SwimmingPool(String nameOfSwimmingPool, int quantity, SwimmingPoolCategory category) {
        super.getAddress();
        super.getNameOfCenter();
        this.nameOfSwimmingPool = nameOfSwimmingPool;
        this.quantity = quantity;
        this.category = category;
    }


    @Override
    public void print() {

        System.out.println(getNameOfCenter() + " " +getAddress() + "\n" + " Название бассейна: " + nameOfSwimmingPool +
                "\n" + " Количество бассейнов " + quantity + "\n" + " Категория: " + category);
        System.out.println("_________________________________________");


    }
}
