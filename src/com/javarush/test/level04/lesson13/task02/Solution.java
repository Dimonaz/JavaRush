package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String strM = bufferedReader.readLine();
        String strN = bufferedReader.readLine();
        int intM = Integer.parseInt(strM);
        int intN = Integer.parseInt(strN);


        for (int i = 0; i < intM; i++){
            for (int j = 0; j < intN; j++){
                System.out.print("8");
            }
            System.out.println("\r");

        }

    }
}
