package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)throws ParseException
    {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM" + " dd yyyy", Locale.ENGLISH);
        String sDate = dateFormat.format(date);
        isDateOdd(sDate);
    }

    public static boolean isDateOdd(String date)throws ParseException
    {

        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat(("MMM").toUpperCase() + " dd yyyy", Locale.ENGLISH);
        Date currentDate = dateFormat.parse(date);
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        long msTimeDistance =






        return true;
    }
}

