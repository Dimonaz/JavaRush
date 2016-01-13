package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        List<Integer> data = new ArrayList<Integer>();
        List<Integer> sorted = new ArrayList<Integer>();

        while (stream.available() > 0)
        {
            data.add(stream.read());
        }

        Collections.sort(data);

        for (int i = 0; i < data.size(); i++)
        {
            if(!sorted.contains(data.get(i))) sorted.add(data.get(i));
        }

        for (int i = 0; i < sorted.size(); i++){
            if (i+1 == sorted.size()) System.out.print(sorted.get(i));
            else System.out.print(sorted.get(i) + " ");
        }

            reader.close();
            stream.close();
    }
}


