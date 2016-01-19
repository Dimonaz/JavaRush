package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
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

        FileInputStream inputStream1 = new FileInputStream(filename1);
        FileInputStream inputStream2 = new FileInputStream(filename2);

        byte[] buffer1 = new byte[inputStream1.available()];

        if (inputStream1.available() > 0){
            inputStream1.read(buffer1);
        }

        FileOutputStream outputStream1 = new FileOutputStream(filename1);

        while (inputStream2.available() > 0)  outputStream1.write(inputStream2.read());

        outputStream1 = new FileOutputStream(filename1, true);
        outputStream1.write(buffer1, 0, buffer1.length);

        reader.close();
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();
    }
}
