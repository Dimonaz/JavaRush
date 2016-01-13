package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Dimonaz on 07.01.2016.
 */
public class TeaMaker extends DrinkMaker
{
    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    public void pour() {
        System.out.println("Заливаем водой");
    }
}
