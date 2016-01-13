package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Dimonaz on 25.12.2015.
 */
public class MoldovanHen extends Hen
{
    int getCountOfEggsPerMonth(){return 4;}

    public String getDescription (){
        return super.getDescription ()  + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
