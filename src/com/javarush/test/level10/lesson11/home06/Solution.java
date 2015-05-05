package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        ArrayList<String> children;
        ArrayList<String> parents;
        boolean isMarried;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, List<String> children){

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = new ArrayList<String>(children);

            }

        public Human(String name, int age, boolean sex, List<String> children, List<String> parents){

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = new ArrayList<String>(children);
            this.parents = new ArrayList<String>(parents);

        }

        public Human(String name, int age, boolean sex, boolean isMarried){

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.isMarried = isMarried;

        }

        public Human(String name, int age, boolean sex, List<String> children, boolean isMarried){

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = new ArrayList<String>(children);
            this.isMarried = isMarried;

        }

        public Human(String name, int age, boolean sex, List<String> children, List<String> parents, boolean isMarried){

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = new ArrayList<String>(children);
            this.parents = new ArrayList<String>(parents);
            this.isMarried = isMarried;

        }

        public Human(String name, List<String> children){
            this.name = name;
            this.children = new ArrayList<String>(children);
        }

        public Human(String name, boolean isMarried){
            this.name = name;
            this.isMarried = isMarried;
        }
    }
}
