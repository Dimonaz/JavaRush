package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] params = {};
        try
        {
            URL url = new URL(reader.readLine());
            params = url.getQuery().split("&");

        }catch (IOException e){}

        List<String> objList = new ArrayList<String>();
        List <String> paramNames = new ArrayList<String>();

        for (String param:params){
            if (param.startsWith("obj=")) objList.add(param);
            if (param.contains("=")) paramNames.add(param.substring(0,(param.indexOf("="))));
            else paramNames.add(param);
        }

        for (int i = 0; i < paramNames.size(); i++){
            if(i+2 > paramNames.size())
            {
                System.out.print(paramNames.get(i));
            }
            else
                System.out.print(paramNames.get(i) + " ");
        }

        System.out.println();

        if (objList.size() > 0){
            for (String obj: objList){
                String objValue = obj.substring(obj.indexOf("=")+1);
                try{
                    Double objDouble = Double.parseDouble(objValue);
                    alert(objDouble);
                } catch (NumberFormatException e)
                {
                    alert(objValue);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
