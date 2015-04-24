package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
        String sFourth = bufferedReader.readLine();
        int iFourth = Integer.parseInt(sFourth);

        if (iFirst > iSecond && iFirst > iThird && iFirst > iFourth) System.out.println(iFirst);
        else if (iSecond > iFirst && iSecond > iThird && iSecond > iFourth) System.out.println(iSecond);
        else if (iThird > iSecond && iThird > iFirst && iThird > iFourth) System.out.println(iThird);
        else if (iFourth > iSecond && iFourth > iThird && iFourth > iFirst) System.out.println(iFourth);

    }
}
