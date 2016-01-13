package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        InputStream inStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String fileName = reader.readLine();
        FileWriter writer = new FileWriter(fileName,false);

        while (true){
            String line = reader.readLine();
            writer.write(line);
            writer.write(System.lineSeparator());
            if (line.equals("exit")) break;
        }

        reader.close();
        writer.close();
    }
}
