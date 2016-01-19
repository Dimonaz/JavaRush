package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

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
                tmp = fReader.read();
                String str = Character.toString ((char) tmp);
                if (!Pattern.matches("\\p{Punct}", str)) writer.write(tmp);
            }

            reader.close();
            fReader.close();
            writer.close();

        }catch (Exception e){}
    }
}
