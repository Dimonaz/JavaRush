package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            String output = reader.readLine();

            File source = new File(input);
            Scanner scan = new Scanner(source);
            FileWriter writer = new FileWriter(output);
            List<String> words = new ArrayList<String>();
            List<String> numbers = new ArrayList<String>();

            while (scan.hasNext()) words.add(scan.next());

            for (String word: words){
            if (word.matches("\\d+")) numbers.add(word);
            }

            for (int i = 0; i < numbers.size(); i++){
                if (i+1 == numbers.size()) writer.write(numbers.get(i));
                else writer.write(numbers.get(i) + " ");
            }

            reader.close();
            scan.close();
            writer.close();

        }catch (Exception e){}
    }
}
