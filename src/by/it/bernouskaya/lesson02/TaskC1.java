package by.it.bernouskaya.lesson02;


/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/

import java.util.Scanner;
class TaskC1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)
            System.out.println("Введите число a: ");
            int a = sc.nextInt();
            System.out.println("Введите число b: ");
            int b = sc.nextInt();
            int c = a - a;
            int d=c+b;
            System.out.println("Sum" + " " + "=" + " " + d);

         }

}
