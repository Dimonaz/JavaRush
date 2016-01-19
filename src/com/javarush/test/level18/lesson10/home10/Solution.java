package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileNames = new ArrayList<String>();
        String fileName;
        try
        {
            while (!(fileName = reader.readLine()).equals("end"))
            {
                fileNames.add(fileName);
            }
        }
        catch (IOException e){}

            Collections.sort(fileNames);

            String name = fileNames.get(0).substring(0,fileNames.get(0).indexOf(".part"));

        try
        {
            FileOutputStream outputStream;
            FileInputStream inputStream;

            for (int i = 0; i < fileNames.size(); i++)
            {
                inputStream = new FileInputStream(fileNames.get(i));
                outputStream = new FileOutputStream(name, true);
                byte[] buffer = new byte[inputStream.available()];
                while (inputStream.available() > 0)
                {
                    inputStream.read(buffer);
                }
                inputStream.close();
                outputStream.write(buffer);
                outputStream.close();
            }

            reader.close();

        }catch (IOException e){}
    }
}

