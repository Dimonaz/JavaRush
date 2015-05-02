package com.javarush.test.level09.lesson11.home05;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        List<String> vowels = new ArrayList<String>();
        List<String> nonVowels = new ArrayList<String>();

        char[] array = s.toCharArray();

        for (char letter : array){
            if (isVowel(letter)) vowels.add(Character.toString(letter));
            else if (!isVowel(letter) && !Character.toString(letter).equals(" ")) nonVowels.add(Character.toString(letter));
            }

        for (int i = 0; i < vowels.size(); i++)
        {
            if (i+1 == vowels.size()) System.out.println(vowels.get(i));
            else System.out.print(vowels.get(i) + " ");
        }


       System.out.println("\r");


        for (int i = 0; i < nonVowels.size(); i++)
        {
            if (i+1 == nonVowels.size()) System.out.println(nonVowels.get(i));
            else System.out.print(nonVowels.get(i) + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}