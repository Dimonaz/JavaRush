package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream(args[0]);
        byte[] buffer = new byte[stream.available()];
        int allCount = stream.read(buffer);
        int spaceCount = 0;
        for (Byte b: buffer){
            if (Character.isSpaceChar(b)) spaceCount++;
        }

        double result =  (double) spaceCount/allCount * 100;
        result = Math.floor(result*100)/100;


        System.out.println(result);
        stream.close();
    }
}
