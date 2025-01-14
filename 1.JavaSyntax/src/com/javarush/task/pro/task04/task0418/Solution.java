package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.nextBoolean();
        if (flag){
           double glassesCeil =  Math.ceil(glass);
            System.out.println((int)glassesCeil);
        }else {
            double glassesCeil = Math.floor(glass);
            System.out.println((int)glassesCeil);
        }

    }
}