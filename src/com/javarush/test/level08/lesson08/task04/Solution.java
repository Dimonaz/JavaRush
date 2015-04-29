package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Сталлоне1", new Date("JULY 1 1980"));
        map.put("Стаdsfе2", new Date("SEPTEMBER 1 1980"));
        map.put("Сталfffлоне3", new Date("OCTOBER 1 1980"));
        map.put("Сталлdffоне4", new Date("NOVEMBER 1 1980"));
        map.put("Сталлоне5", new Date("JUNE 1 1980"));
        map.put("Сталffлоне6", new Date("AUGUST 1 1980"));
        map.put("Сталлоeeне7", new Date("MARCH 1 1980"));
        map.put("Сталeeлоeeeeне8", new Date("FEBRUARY 1 1980"));
        map.put("Сталлeeeоне9", new Date("JANUARY 1 1980"));
        map.put("Сталлоeне10", new Date("APRIL 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> entry = iterator.next();
            int month = entry.getValue().getMonth();
            if ((month >= 5) && (month <= 7))
                iterator.remove();
        }

    }

}
