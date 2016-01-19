package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileOutputStream outputStream = new FileOutputStream(filename2);

        if (inputStream.available() > 0) {

            byte[] buffer1 = new byte[inputStream.available()];
            byte[] buffer2 = new byte[inputStream.available()];
            int count = inputStream.read(buffer1);

            for (int i = 0; i < count; i++){
                buffer2[i] = buffer1[count - 1 - i];
            }
            outputStream.write(buffer2, 0, buffer2.length);
        }

        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
