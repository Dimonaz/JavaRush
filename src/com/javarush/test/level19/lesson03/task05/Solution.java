package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {

    private static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        public String getCountryCode(){
            String country = customer.getCountryName();
            String code = "";
            Iterator<Map.Entry<String,String>> itr = countries.entrySet().iterator();
            while (itr.hasNext()){
                Map.Entry<String,String> entry = itr.next();
                if (entry.getValue().equals(country)) code = entry.getKey();
            }
            return code;
        }

        public String getCompany(){
            return customer.getCompanyName();
        }            //example JavaRush Ltd.

        public String getContactFirstName(){
            String name = contact.getName();
            return name.substring(name.indexOf(" ")+1);
        }   //example Ivan

        public String getContactLastName(){
            String name = contact.getName();
            return name.substring(0,name.indexOf(","));
        }    //example Ivanov

        public String getDialString(){
            String number = contact.getPhoneNumber();
            String dialStr = number.replaceAll("\\(","");
            String dialStr1 = dialStr.replaceAll("\\)","");
            String dialStr2 = dialStr1.replaceAll("-","");
            return "callto://" + dialStr2;
        }         //example callto://+380501234567
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}