package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        List<Integer> data = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        while (stream.available() > 0)
        {
            data.add(stream.read());
        }

        for (int i = 0; i < data.size(); i++)
        {
            if(!map.containsKey(data.get(i)))
                map.put(data.get(i),(Collections.frequency(data, data.get(i))));
        }

        int min = Collections.min(map.values());
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer,Integer> entry = itr.next();
            if (entry.getValue() == min){
                if (itr.hasNext()) System.out.print(entry.getKey() + " ");
                else System.out.print(entry.getKey());
            }

            reader.close();
            stream.close();
        }
    }
}
