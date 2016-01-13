package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Dimonaz on 07.01.2016.
 */
public class LatteMaker extends DrinkMaker
{
    public void putIngredient() {
        System.out.println("Делаем кофе");
    }

    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    public void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}
