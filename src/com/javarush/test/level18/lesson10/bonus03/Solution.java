package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> arrayList = new ArrayList<String>();
    private static BufferedReader bufferedReader;

    public static void main(String[] args) throws IOException
    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine(), updateString, id, productName = "", price, quantity;
        bufferedReader.close();

        if (args.length > 4 && args[0].equals("-u")) {
            id = args[1];
            price = args[args.length - 2];
            quantity = args[args.length - 1];
            for (int i = 2; i < (args.length - 2); i++) {
                productName += args[i] + " ";
            }

            updateString = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", id, productName, price, quantity); // строка для обновления

            readFile(nameFile);
            findString(id, updateString);
            writeFile(nameFile);
        } else if (args.length == 2 && args[0].equals("-d")) {
            id = args[1];
            readFile(nameFile);
            findString(id);
            writeFile(nameFile);
        }
    }

    static void readFile(String nameFile) throws IOException { // чтение строк из файла
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile), "CP1251"));
        String s;
        while((s = bufferedReader.readLine()) != null) {
            arrayList.add(s);
        }
        bufferedReader.close();
    }

    static void writeFile(String nameFile) throws IOException { // запись в файл
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile), "CP1251"));
        for (String s : arrayList) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    static void findString(String id) { // физическое удаление искомой строки
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.length() >= 8 && s.substring(0, 8).trim().equals(id))
            {
                arrayList.remove(i);
            }
        }
    }

    static void findString(String id, String updateString) { // обновление искомой строки
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.length() >= 8 && s.substring(0, 8).trim().equals(id))
            {
                arrayList.set(i, updateString);
                break;
            }
        }
    }
}