package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String,String> copy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            int count = Collections.frequency(map.values(), pair.getValue());
                if (count > 2) removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
