package com.javarush.test.level19.lesson03.task04;


import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {



    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner scanner;
        public  PersonScannerAdapter (Scanner scanner){
            this.scanner = scanner;
        }

        private String firstName;
        private String middleName;
        private String lastName;
        private int day;
        private int month;
        private int year;
        private Calendar birthDate;

        public Person read() throws IOException{

            lastName = scanner.next();
            firstName = scanner.next();
            middleName = scanner.next();
            day = Integer.parseInt(scanner.next());
            month = Integer.parseInt(scanner.next())-1;
            year = Integer.parseInt(scanner.next());

            birthDate = new GregorianCalendar(year, month, day);

            Person person = new Person(firstName, middleName, lastName, birthDate.getTime());

        return person;
        }

        public void close() throws IOException{
            scanner.close();
        }

    }
}
