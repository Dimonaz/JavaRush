package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        FileInputStream inputStream = new FileInputStream(args[0]);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        int count;
        for (int i = 0; i < buffer.length; i++){
            if (!(map.containsKey((char)buffer[i]))){
                map.put((char)buffer[i],1);
            }else {
                count = map.get((char)buffer[i]);
                map.put((char)buffer[i], count+1);
            }
        }

        List<Character> keys = new ArrayList<Character>(map.keySet());
        List<Integer> ascii = new ArrayList<Integer>();
        for (Character key : keys)  ascii.add((int)key);
        Collections.sort(ascii);

        int[] arr = new int[ascii.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = ascii.get(i);

        for(int i = 0; i < arr.length; i++){
            System.out.println(((char) arr[i]) + " " + map.get((char)arr[i]));
        }
        inputStream.close();
    }
}
