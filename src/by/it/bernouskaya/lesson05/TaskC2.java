package by.it.bernouskaya.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC2 {
    //Напишите тут ваш код

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list =new ArrayList<>();
        while (true){
            String s=reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));

        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);
        for (String x: array){

            System.out.println(x);
        }


    }



    public static void sort(String[] array) {
        //Напишите тут ваш код

        for (int i = 1; i < array.length - i + 1; i++) {

            array[i - 1] = array[i];
        }
    }
}
