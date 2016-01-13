package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Dimonaz on 25.12.2015.
 */
public class BelarusianHen extends Hen
{
    int getCountOfEggsPerMonth(){return 7;}

    public String getDescription (){
        return super.getDescription ()  + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
