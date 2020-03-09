package com.artemshkonda;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.InputStream;
import java.util.*;

public class Methods {

    public int findMin(int a, int b){
        int min = a;
        if(b<a){
            min = b;
        } else if (a==b) {
            System.out.println(a+ " is equal " +b);
        }
        System.out.println("min is equal " + min);
        return min;
    }

    public static double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
    }

    public int Factorial(int n){
            int fac = 1;
            for (int i = 1; i<=n; i++){
                fac = fac*i;
            }
            return fac;
    }

    public boolean triangle (double a, double b, double c) {
        boolean t;
        try {
            if (a >= b + c || b >= a + c || c >= a + b||a<=0||b<=0||c<=0) {
                System.out.println("Треугольник не существует");
                t = false;
            }
            else {
                System.out.println("Треугольник существует");
                t = true;
            }
            System.out.println("Проверка возможности существования треугольника выполнена");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Проверка не была выполнена");
            t = false;
        }
        return t;
    }
// 4 задача
    public void Zero(int a){
            for (int i=0; i<=a; i++) {
                {
                    for (int j=i; j>0; j--){
                        System.out.print("0 ");
                    }
                    System.out.println();
                }
            }
    }

  //4 задача
    public void printTriangle(int a){
        for (int i=0; i<a; i++){
            for (int j=0; j<=i; j++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public double Index (double m, double h){
       return (m/(h*h));
    }

    /**
     * 6 Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
     * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
     * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
     * изученные операторы Метод буленовский возвращает правда или ложь
     * @param
     */
    public static void number () {
        System.out.println("Введите трехзначное число");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int first = a/100;
        int second = a/10%10;
        int third = a%10;

        if (a < 100 || a >= 1000) {
            System.out.println("Число должно быть трехзначным");
        }
        else if (first == second||first == third||second==third) {
            System.out.println("Среди указанного значения есть одинаковые цифры");
        }
        else {
            System.out.println("Среди указаного значения одинаковых цифр не найденно");
        }
    }




    /**
     * 7 написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
     * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
     * на вход и что возвращает
     * @param l
     * @param h
     * @param m
     * @return
     */
    public double poll (double l, double h, double m){
        double v = l*h*m;
        System.out.println("Для заполнения бассейна нужно "+v+" литров");
        return v;
    }

    /**
     * 8 При поступлении в вуз абитуриенты, получившие &quot;двойку&quot; на первом экзамене, ко второму не
     * допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     * Подсчитать, сколько человек не допущено ко второму экзамену.
     * @param arr
     * @return
     */
    public int exam(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 2) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Ко второму экзамену допущены все студенты");
        }
        else {
            System.out.println("Ко второму экзамену не допущено " + count + " студентов");
        }
        return count;
    }


    /**
     * 9. У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
     * продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
     * выбрать, чтобы выгодно обменять доллары на рубли.
     * @param arr
     * @return
     */
    public int bank(int[]arr){
        int imax = 0;
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                imax = i;
            }
        }
        System.out.println("Вам выгодно обменять доллары на рубли в банке под номером "+imax);
        return imax;
    }





    /**
     * 10. Вывести на экран строку S указанное количество раз N
     * @param a
     * @param b
     */
    public void printStr (String a, int b){
        for (int i = 0; i<b; i++)
        {
            System.out.println(a);
        }
    }


    /**
     * 11 Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     * @param arr
     * @return
     */
    public int MaxMin (int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
            else if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max+min);
        return (max+min);
    }


    /**
     * 12 Вычислить площадь треугольника
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double triangleSquare (double a, double b, double c){
        double s =-1;
        if (triangle(a,b,c)){
            double p;
            p = (a+b+c)/2;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        else {
            System.out.println("Треугольник не существует");
        }
        return s;
    }

    /**
     * 13. Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника
     *
     * @param a
     * @return
     */
    public double sqrSixangles(double a){
        return triangleSquare(a, a, a)*6;
    }

    /**
     * 14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     * @return
     */
    public int sumFactorial(){
        int s = 0;
        for (int i = 1; i<=9; i++){
            if(i%2 != 0){
                s = Factorial(i)+s;
            }
        }
        System.out.println(s);
        return s;
    }

    /**
     * 15 Написать программу которая возвращает стоимость покупки с учетом дисконта
     * Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     * скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     * @param s
     * @return
     */
    public double Sale (double s){
        if (s<=1000){
            return s;
        }
        else if  (s>=1001&&s<=2000) {
            return (s*0.02)+s;
        }
        else if (s>=2001&&s<=5000) {
            return (s*0.05)+s;
        }
        else {
            return (s*0.07)+s;
        }

    }
}