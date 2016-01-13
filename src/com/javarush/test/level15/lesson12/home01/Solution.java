package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new LinkedList<String>();
        String input;
        Double d = null;
        while (!(input = reader.readLine()).equals("exit"))
        {
            list.add(input);
        }
        for (String s : list)
        {
            try
            {
                if (s.contains("."))
                {
                    d = Double.valueOf(s);
                    print(d);
                } else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                {
                    short sh = Short.valueOf(s);
                    print(sh);
                } else if (Integer.parseInt(s) >= 128)
                {
                    Integer i = Integer.valueOf(s);
                    print(i);
                }
                else print (s);
            }
            catch (NumberFormatException e)
            {
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
