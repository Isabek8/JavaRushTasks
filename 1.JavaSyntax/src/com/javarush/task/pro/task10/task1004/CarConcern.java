package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year , String color) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        color = "Оранжевый";
    }

    public CarConcern(String model) {
        //напишите тут ваш код
        this.model = model;
        year = 4321;
        color = "Оранжевый";
    }
}
