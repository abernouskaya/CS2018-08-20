package by.it.bernouskaya.lesson04;

import by.it._examples_.demo03.Summator;

import java.util.Calendar;
import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();

        int result = 0;
        if (month ==1)
        {result = 0;}
                if (month==2)
                {result =31;}
                if (month==3)
        {result = 59;}
        if (month==4)
        {result = 90;}
                if (month==5)
                {result= 120;}
                if (month==6)
                {result= 151;}
                if (month==7)
                {result= 181;}
                if (month==8)
                {result = 212;}
                if (month==9)
                {result= 243;}
                if (month==10)
                {result= 273;}
                if (month==11)
                {result= 304;}
                if (month==12)
                {result=334;}
            System.out.println(date + result);
        }
    }



