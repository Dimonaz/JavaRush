package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
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
        String filename3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(filename1);
        FileInputStream inputStream2 = new FileInputStream(filename2);
        FileInputStream inputStream3 = new FileInputStream(filename3);

        byte[] buffer2 = new byte[inputStream2.available()];
        byte[] buffer3 = new byte[inputStream3.available()];

        if (inputStream2.available() > 0){
            inputStream2.read(buffer2);
        }

        if (inputStream3.available() > 0){
            inputStream3.read(buffer3);
        }

        outputStream.write(buffer2, 0, buffer2.length);
        outputStream.write(buffer3, 0, buffer3.length);

        reader.close();
        inputStream2.close();
        inputStream3.close();
        outputStream.close();
    }
}
