package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        int count = 0;

        if (inputStream.available() > 0)
        {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            for (int i = 0; i < buffer.length; i++ ){
                if ((int)buffer[i] == 44) count++;
            }
            System.out.println(count);
            reader.close();
            inputStream.close();
        }
    }
}
