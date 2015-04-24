package com.company;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String years = bufferedReader.readLine();
        String salary = bufferedReader.readLine();
        String name = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");

    }
}
