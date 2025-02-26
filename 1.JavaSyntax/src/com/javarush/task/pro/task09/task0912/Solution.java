package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        return url.startsWith("https") || url.startsWith("http") ? url.split(":")[0] : "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        return url.endsWith("com") || url.endsWith("net") || url.endsWith("org") || url.endsWith("ru") ? url.split("\\.") [1] :"неизвестный";
    }
}
