package com.company;

public class Restaurant extends BusinessCenter implements Printable{

    private String nameOfRestaurant;
    private int quantity;
    private int stars; //1,2,3,4,5
    private RestaurantCategory category; // люкс, высшей и первой категории  "Lux", "high" and "first" category

    public Restaurant(String nameOfRestaurant, int quantity, int stars, RestaurantCategory category) {
        super.getAddress();
        super.getNameOfCenter();
        this.nameOfRestaurant = nameOfRestaurant;
        this.quantity = quantity;
        this.stars = stars;
        this.category = category;
    }

    @Override
    public void print() {

        System.out.println(getNameOfCenter() + " " + getAddress() + "\n" + " Название ресторана: " + nameOfRestaurant +
                "\n" + " Количество зала: " + quantity + "\n" + " Количество звезд: " + stars + "\n" + " Категория: " + category);
        System.out.println("_________________________________________");

    }
}
