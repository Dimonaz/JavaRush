package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {

        Human grandpaF = new Human("Вова", true, 80, null, null);
        Human grandmaF = new Human("Галя", false, 81, null, null);
        Human grandpaM = new Human("Лёша", true, 79, null, null);
        Human grandmaM = new Human("Аня", false, 78, null, null);
        Human father = new Human("Валера", true, 65, grandpaF, grandmaF);
        Human mother = new Human("Ира", false, 67, grandpaM, grandmaM);
        Human son1 = new Human("Дима", true, 30, father, mother);
        Human son2 = new Human("Игорь", true, 25, father, mother);
        Human daughter = new Human("Лена", false, 40, father, mother);

        System.out.println(grandpaF.toString());
        System.out.println(grandmaF.toString());
        System.out.println(grandpaM.toString());
        System.out.println(grandmaM.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother){

            this.name = name;
            this. sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
