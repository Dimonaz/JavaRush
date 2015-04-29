package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> grandpasFchildren = new ArrayList<Human>();
        ArrayList<Human> grandmasFchildren = new ArrayList<Human>();
        ArrayList<Human> grandpasMchildren = new ArrayList<Human>();
        ArrayList<Human> grandmasMchildren = new ArrayList<Human>();
        ArrayList<Human> fathersChildren = new ArrayList<Human>();
        ArrayList<Human> mothersChildren = new ArrayList<Human>();

        Human child1 = new Human("Child1", true, 10, null);
        Human child2 = new Human("Child2", false, 8, null);
        Human child3 = new Human("Child3", true, 5, null);

        fathersChildren.add(child1);
        fathersChildren.add(child2);
        fathersChildren.add(child3);
        mothersChildren.add(child1);
        mothersChildren.add(child2);
        mothersChildren.add(child3);

        Human father = new Human("Father", true, 45, fathersChildren);
        grandpasFchildren.add(father);
        grandmasFchildren.add(father);
        Human mother = new Human("Mother", false, 40, mothersChildren);
        grandpasMchildren.add(mother);
        grandmasMchildren.add(mother);

        Human grandpaF = new Human("GrandpaF",true, 80, grandpasFchildren);
        Human grandmaF = new Human("GrandmaF", false, 79, grandmasFchildren);
        Human grandpaM = new Human("GrandpaM",true, 83, grandpasMchildren);
        Human grandmaM = new Human("GrandmaM", false, 81, grandmasMchildren);

        System.out.println(grandpaF);
        System.out.println(grandmaF);
        System.out.println(grandpaM);
        System.out.println(grandmaM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {

            this.name = name;
            this.sex = sex;
            this.age = age;

            try
            {
            if (children.size()!=0)
            {
                for (int i = 0; i < children.size(); i++)
                    this.children.add(children.get(i));
            }
            } catch (NullPointerException e){};
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
