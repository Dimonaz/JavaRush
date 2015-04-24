package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sFirst = bufferedReader.readLine();
        int iFirst = Integer.parseInt(sFirst);
        String sSecond = bufferedReader.readLine();
        int iSecond = Integer.parseInt(sSecond);
        String sThird = bufferedReader.readLine();
        int iThird = Integer.parseInt(sThird);

        List<Integer> list = new ArrayList<Integer>();
        list.add(0, iFirst);
        list.add(1, iSecond);
        list.add(2, iThird);

        Collections.sort(list);

        for (int i = list.size(); i > 0; i--){
        System.out.println(list.get(i-1));
    }
}}
