package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Dimonaz on 26.12.2015.
 */
public class Singleton
{
    private Singleton(){}
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {return singleton;}
}
