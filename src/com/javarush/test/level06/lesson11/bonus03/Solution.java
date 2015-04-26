package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<Integer>();

        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        int i4 = Integer.parseInt(reader.readLine());
        int i5 = Integer.parseInt(reader.readLine());

        list.add(0, i1);
        list.add(1, i2);
        list.add(2, i3);
        list.add(3, i4);
        list.add(4, i5);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }
    }
}
