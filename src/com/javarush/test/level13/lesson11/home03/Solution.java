package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        InputStream input = System.in;
        Reader inputStreamReader = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String fileName = reader.readLine();

        BufferedReader in = new BufferedReader(new FileReader(fileName));

        String line = in.readLine();
        while (line != null)
        {
            System.out.println(line);
            line = in.readLine();
        }
        input.close();
        in.close();
    }
}
