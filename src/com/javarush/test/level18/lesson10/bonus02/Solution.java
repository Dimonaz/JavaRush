package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

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
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception
    {

        if (args[0].equals("-c"))
        {

            try
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String fileName = reader.readLine();
                reader.close();
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                List<String> lines = new ArrayList<String>();
                while (fileReader.ready()) lines.add(fileReader.readLine());
                String lastLine = lines.get(lines.size() - 1);

                String lastID = lastLine.substring(0, 8);
                Integer tempID = Integer.parseInt(lastID.replaceFirst("\\s+$", ""));
                tempID++;
                String NewID = tempID.toString();
                if (NewID.length() < 8) NewID = String.format("%-8s", NewID);

                String product = args[1];
                if (product.length() < 30) product = String.format("%-30s", product);
                if (product.length() > 30) product = product.substring(0, 30);

                String price = args[2];
                if (price.length() < 8) price = String.format("%-8s", price);
                if (price.length() > 8) price = price.substring(0, 8);

                String quantity = args[3];
                if (quantity.length() < 4) quantity = String.format("%-4s", quantity);
                if (quantity.length() > 4) quantity = quantity.substring(0, 4);

                StringBuilder sb = new StringBuilder();
                sb.append(NewID);
                sb.append(product);
                sb.append(price);
                sb.append(quantity);

                String finalStr = sb.toString();

                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName ,true), "UTF-8"));
                out.write("\n");
                out.write(finalStr);
                out.close();
            }
            catch (IOException e)
            {
            }
        }
    }
}
