package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {

        HashMap<String, String> map = new HashMap();

        map.put("Пупкин", "Вася");
        map.put("Найденов", "Дима");
        map.put("Агеев", "Никита");
        map.put("Нечаев", "Саша");
        map.put("Минзяк", "Дима");
        map.put("Найденова", "Ира");
        map.put("Прохорова", "Саша");
        map.put("Иванова", "Галя");
        map.put("Иванов", "Саша");
        map.put("Сорокина", "Люда");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int counter = 0;

        for (Map.Entry<String, String> pair : map.entrySet()){

            if (pair.getValue().equals(name))
                counter++;
        }
        return counter;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int counter = 0;

        for (Map.Entry<String, String> pair : map.entrySet()){

            if (pair.getKey().equals(familiya))
                counter++;
        }
        return counter;

    }


}
