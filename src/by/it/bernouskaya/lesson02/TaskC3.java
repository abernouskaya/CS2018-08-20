package by.it.bernouskaya.lesson02;



/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51

*/


import java.util.Scanner;

class TaskC3 {
    static double getWeight (int weight){
        double g= 9.81;
        double gmars = 3.86;
        double result = weight*gmars/g;
        double delta=result*100-((int)(result*100));
        if (delta <0.5)
            return (int) (result * 100) / 100.0;
            else
            return
            (int) ((result * 100) + 1) / 100.00;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int weight=sc.nextInt();
            System.out.println(getWeight(weight));
        }

        }








