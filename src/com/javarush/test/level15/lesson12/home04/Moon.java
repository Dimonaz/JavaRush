package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Dimonaz on 06.01.2016.
 */
public class Moon implements Planet
{
    private Moon(){}
    private static Moon moon;
    public static Moon getInstance() {
        if (moon == null){
            moon = new Moon();
        }
        return moon;
    }
}
