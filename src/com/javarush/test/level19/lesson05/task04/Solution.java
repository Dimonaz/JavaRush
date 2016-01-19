package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            String output = reader.readLine();

            FileReader fReader = new FileReader(input);
            FileWriter writer = new FileWriter(output);
            int tmp;

            while (fReader.ready()){
                char dot = '.';
                char exclaim = '!';
                tmp = fReader.read();
                if (tmp == (int)dot) tmp = (int)exclaim;
                writer.write(tmp);
            }

            reader.close();
            fReader.close();
            writer.close();

        }catch (Exception e){}
    }
}
