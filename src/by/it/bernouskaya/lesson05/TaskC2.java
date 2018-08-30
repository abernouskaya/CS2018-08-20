package by.it.bernouskaya.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {

            String s = reader.readLine();

            if (s.isEmpty()) break;

            array.add(Integer.parseInt(s));
        }



        }
    }








