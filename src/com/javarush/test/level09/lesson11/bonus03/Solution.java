package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {

        List<String> letters = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();
        boolean[] isInt = new boolean[array.length];

        for (int i =0; i < array.length; i++){
            if (isNumber(array[i]))
            {
                numbers.add(Integer.parseInt(array[i]));
                isInt[i] = true;
            }else {
                letters.add(array[i]);
                isInt[i] = false;
            }

        }

        Collections.sort(letters);

        int[] arrNumbers = new int[numbers.size()];
        for (int i = 0; i < arrNumbers.length; i++)
            arrNumbers[i] =  numbers.get(i);

        int tmp;

        for (int i = 0; i < ( arrNumbers.length - 1 ); i++) {
            for (int j = 0; j < arrNumbers.length - i - 1; j++) {
                if (arrNumbers[j] < arrNumbers[j+1]) /* For descending order use < */
                {
                    tmp  = arrNumbers[j];
                    arrNumbers[j]   = arrNumbers[j+1];
                    arrNumbers[j+1] = tmp;
                }
            }
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isInt[i] == false)
            {
                array[i] = letters.get(j);
                j++;
            } else continue;

       }

        int f = 0;
        for (int i = 0; i < array.length; i++){
            if (isInt[i] == true)
            {
                array[i] = String.valueOf(arrNumbers[f]);
                f++;
            }else continue;
            }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
