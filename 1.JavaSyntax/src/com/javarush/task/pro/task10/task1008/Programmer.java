package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    //напишите тут ваш код
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary > this.salary? salary : this.salary;
    }

}
