package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int age;
    int weight;
    String colour;
    String address;

    public Cat (String name){

        this.name = name;
        this.weight = 15;
        this.age = 7;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat (String name, int age){
        this.name = name;
        this.weight = 15;
        this.age = age;
    }

    public Cat (int weight, String colour){
        this.weight = weight;
        this.colour = colour;
        this.age = 7;
    }

    public Cat (int weight, String colour, String address){
        this.weight = weight;
        this.colour = colour;
        this.address = address;
        this.age = 7;
    }

}
