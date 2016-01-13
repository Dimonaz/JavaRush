package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Dimonaz on 06.01.2016.
 */
public class Sun implements Planet
{
    private Sun(){}
    private static Sun sun;
    public static Sun getInstance() {
        if (sun == null){
            sun = new Sun();
        }
            return sun;
    }
}
