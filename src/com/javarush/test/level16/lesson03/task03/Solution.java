package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread SPthread1 = new SpecialThread();
        SpecialThread SPthread2 = new SpecialThread();
        SpecialThread SPthread3 = new SpecialThread();
        SpecialThread SPthread4 = new SpecialThread();
        SpecialThread SPthread5 = new SpecialThread();

        Thread thread1 = new Thread(SPthread1);
        Thread thread2 = new Thread(SPthread2);
        Thread thread3 = new Thread(SPthread3);
        Thread thread4 = new Thread(SPthread4);
        Thread thread5 = new Thread(SPthread5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
            }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
