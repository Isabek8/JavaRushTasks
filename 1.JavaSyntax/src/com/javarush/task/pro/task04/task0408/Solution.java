package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (max < number && number % 2 == 0){
                max = number;
            }
        }
        System.out.println(max);

    }
}