package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        List<String> fileNames = new ArrayList<String>();

        try
        {
            while (true)
            {
                if (!((fileName = reader.readLine()).equals("exit")))
                {
                    fileNames.add(fileName);
                } else
                    break;
            }
            reader.close();

        for (String s : fileNames)
            new ReadThread(s).start();

    }catch (IOException e){}

    }

    public static class ReadThread extends Thread
    {
        private String fileName;

        public ReadThread(String fileName) throws FileNotFoundException
        {
            this.fileName = fileName;
        }

        public synchronized void run()
        {

            try
            {
                FileInputStream inputStream = new FileInputStream(fileName);
                List<Integer> data = new ArrayList<Integer>();

                while (inputStream.available() > 0)
                {
                    data.add(inputStream.read());
                }
                inputStream.close();

                Integer maxValue = data.get(0);
                int max = 0;
                for (int i = 0; i < data.size(); i++){
                    int freq = Collections.frequency(data, data.get(i));
                    if (freq > max){
                        max = freq;
                        maxValue = data.get(i);
                    }
                }

                resultMap.put(fileName, maxValue);
            }
            catch (FileNotFoundException e)
            {
            }
            catch (IOException d)
            {
            }
        }
    }
}
