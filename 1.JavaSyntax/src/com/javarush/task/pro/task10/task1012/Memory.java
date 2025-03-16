package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        for(int i = 0; i < array.length; i++){ //тут я двигаюсь просто по порядку
            if (array[i] == null) { //если вижу null, открываю второй цикл
                for (int u = i + 1; u < array.length; u++) { //в этом цикле двигаюсь пока не найду значение (не null)
                    if (array[u] != null) { //если нашел, то присвоил значению null под индексом i нормальное значение
                        array[i] = array[u];
                        array[u] = null;//а нормальное значение сделал null
                        break;//вышел из второго цикла
                    }
                    if (u == array.length - 1) //если я уже дошел до конца, то значит нечего ловить, выхожу из метода
                        return;
                }
            }
        }
    }
}
