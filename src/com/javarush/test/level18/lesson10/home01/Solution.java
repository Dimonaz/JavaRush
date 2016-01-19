package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        FileInputStream stream = new FileInputStream(args[0]);
        byte[] buffer = new byte[stream.available()];
        stream.read(buffer);
        int count = 0;
        for (Byte b: buffer){
            if (Character.isLetter(b)) count++;
        }

        System.out.println(count);
        stream.close();
    }
}
