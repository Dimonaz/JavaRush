package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            File source = new File(fileName);
            Scanner scan = new Scanner(source).useDelimiter("[^\\w]");
            int count = 0;

            while (scan.hasNext()){
                if (scan.next().equals("world")) count++;
            }
            System.out.println(count);
            reader.close();
            scan.close();

        }catch (Exception e){}
    }
}
