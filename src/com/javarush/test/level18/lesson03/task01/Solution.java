package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        int max = 0;
        int data;

        while (stream.available() > 0){
            data = stream.read();
            if (max < data) max = data;
        }
        System.out.println(max);
        reader.close();
        stream.close();
    }
}
