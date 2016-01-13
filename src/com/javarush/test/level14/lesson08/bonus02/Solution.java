package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int NOD;

        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        int i = 0;

        while (true)
        {
            int rest = list.get(i) % list.get(i+1);
            if (rest == 0) {
                NOD = list.get(i+1);
                break;
            }
            list.add(rest);
            i++;

        }
        System.out.println(NOD);
    }
}
