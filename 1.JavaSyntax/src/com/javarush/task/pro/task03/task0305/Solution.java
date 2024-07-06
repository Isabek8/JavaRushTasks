package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if (first == second && first == third && second == third) {
            System.out.println(first + " " + second + " " + third);
        } else if (first == second){
            System.out.println(first + " " + second);
        } else if (second == third) {
            System.out.println(second + " " + third);
        } else if (first == third) {
            System.out.println(first + " " + third);
        } else {}
        //напишите тут ваш код
    }
}
