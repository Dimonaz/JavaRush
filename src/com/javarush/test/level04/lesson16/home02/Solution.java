package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        String sNum3 = bufferedReader.readLine();
        int iNum1 = Integer.parseInt(sNum1);
        int iNum2 = Integer.parseInt(sNum2);
        int iNum3 = Integer.parseInt(sNum3);

        if ((iNum1 < iNum2 && iNum1 > iNum3)||(iNum1 > iNum2 && iNum1 < iNum3)) System.out.println(iNum1);
        else if ((iNum2 < iNum1 && iNum2 > iNum3)||(iNum2 > iNum1 && iNum2 < iNum3)) System.out.println(iNum2);
        else if ((iNum3 < iNum2 && iNum3 > iNum1)||(iNum3 > iNum2 && iNum3 < iNum1)) System.out.println(iNum3);

    }
}
