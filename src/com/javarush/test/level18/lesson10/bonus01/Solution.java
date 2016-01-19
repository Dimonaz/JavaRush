package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        if (args[0].equals("-e")) encode (args[1], args[2]);
        if (args[0].equals("-d")) decode (args[1], args[2]);


    }

    public static void encode (String fileInputName, String fileOutputName){

        try
        {
            FileInputStream inputStream = new FileInputStream(fileInputName);
            FileOutputStream outputStream = new FileOutputStream(fileOutputName);
            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0) inputStream.read(buffer);
            List<Byte> list = new ArrayList<Byte>();
            for (int i = 0; i < buffer.length; i++) list.add(buffer[i]);
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++)list.set(i, (byte)(list.get(i)+2));
            for (int i = 0; i < buffer.length; i++) buffer[i] = list.get(i);
            outputStream.write(buffer, 0, buffer.length);
            inputStream.close();
            outputStream.close();

        } catch (IOException e){}
    }

    public static void decode (String fileInputName, String fileOutputName){

        try
        {
            FileInputStream inputStream = new FileInputStream(fileInputName);
            FileOutputStream outputStream = new FileOutputStream(fileOutputName);
            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0) inputStream.read(buffer);
            List<Byte> list = new ArrayList<Byte>();
            for (int i = 0; i < buffer.length; i++) list.add(buffer[i]);
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++)list.set(i, (byte)(list.get(i)-2));
            for (int i = 0; i < buffer.length; i++) buffer[i] = list.get(i);
            outputStream.write(buffer, 0, buffer.length);
            inputStream.close();
            outputStream.close();

        } catch (IOException e){}
    }
}
