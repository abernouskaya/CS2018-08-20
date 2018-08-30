package by.it.bernouskaya.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer>list = new ArrayList<>();
        ArrayList <Integer>a = new ArrayList<>();
        ArrayList <Integer>b = new ArrayList<>();
        ArrayList <Integer>c = new ArrayList<>();


        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;


            int x = Integer.parseInt(s);
            if (x % 3 == 0)
                list.add(x);

            if (x % 2 == 0)
                a.add(x);

            if (x % 3 != 0 && x % 2 != 0)
                b.add(x);
            if (x%3==0 && x%2==0)
                c.add(x);
             b.addAll(c);}
        }

    private static void printList(List<Integer> list)
    {

    }
    }

