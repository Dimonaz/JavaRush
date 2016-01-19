package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileWriter writer = new FileWriter(filename2);

        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        List<String> input = new ArrayList<String>();
        List<Long> rounded = new ArrayList<Long>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (true){
            if (i+1 == buffer.length){
                sb.append((char) buffer[i]);
                input.add(sb.toString());
                break;
            }
            else
                if(!(Character.isSpaceChar(buffer[i])))
            {
                sb.append((char) buffer[i]);
                i++;
            }
            else {
                i++;
                input.add(sb.toString());
                sb.setLength(0);
                continue;
            }
        }

        for (String s: input){
            rounded.add((Math.round(Double.parseDouble(s))));
        }

        for (int j =0; j < rounded.size(); j++){
            if (j+1 == rounded.size()){
                writer.write(String.valueOf(rounded.get(j)));
            }else
                writer.write(String.valueOf(rounded.get(j)+ " "));
        }

        reader.close();
        inputStream.close();
        writer.close();
    }
}

