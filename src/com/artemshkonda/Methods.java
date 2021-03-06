package com.artemshkonda;

import org.apache.log4j.Logger;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.*;

public class Methods {
    Logger log;
    ArrayMethods arrayMethods = new ArrayMethods();
    public Methods(){
        log =Logger.getLogger(getClass());
    }

    /**
     * 1 Написать метод возвращающий факториал заданного числа N
     * @param n
     * @return
     */
    public int factorial(int n){
        int fac = 1;
        try{
            for (int i = 1; i<=n; i++){
                fac = fac*i;
            }
            log.info("Фактриал числа был посчитан: "+fac);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("При расчете факториала произошла ошибка");
        }
        return fac;
    }

    /**
     * 2 написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
     * между точками. Посмотреть в учебнике геометрии или в интернете
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public double getDistance(double x1, double y1, double x2, double y2){
        double l = 0;
        try{
            l = Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
            log.info("Расстояние между точками было посчитано: "+l);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при расчете расстояния между точками");
        }
        return l;
    }

    /**
     * 3 Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
     * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
     * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
     * должна быть длиннее суммы двух других
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean triangle (double a, double b, double c) {
        boolean t;
        try {
            if (a >= b + c || b >= a + c || c >= a + b||a<=0||b<=0||c<=0) {
                t = false;
            }
            else {
                t = true;
            }
            log.info("Проверка возможности существования треугольника выполнена: "+t);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Проверка не была выполнена");
            t = false;
        }
        return t;
    }

    /**
     * 4 Почитать про вложенный цикл и вывести треугольник из нулей на экран
     * @param a
     */
    public boolean printTriangle(int a){
        boolean r = false;
        try{
            for (int i=0; i<a; i++){
                for (int j=0; j<=i; j++){
                    System.out.print("0 ");
                }
                System.out.println();
                r = true;
            }
            log.info("Статус вывода треугольника: "+ r);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при выводе трегольника");
        }
        return r;
    }

    /**
     * 5 Задача для тех кто следить за фигурой))) Написать программу которая вычисляет индекс массы
     * тела
     * @param m
     * @param h
     * @return
     */
    public double index (double m, double h){
        double idx = 1;
        try{
            idx = (m/(h*h));
            log.info("Индекс массы тела был посчитан: "+idx);
        }
        catch (ArithmeticException ex){
            ex.printStackTrace();
            log.error(  "Ошибка при расчете интедка массы тела");
        }
        return idx;
    }

    /**
     * 6 Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
     * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
     * просто принимать int на вход и определять есть ли в нем одинаковые цифры Использовать
     * изученные операторы Метод буленовский возвращает правда или ложь
     * @param
     */
    public boolean number () {
        System.out.println("Введите трехзначное число");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int first = a/100;
        int second = a/10%10;
        int third = a%10;
        boolean check = false;
        try{
            if (a < 100 || a >= 1000) {
                System.out.println("Число должно быть трехзначным");
            }
            else if (first == second||first == third||second==third) {
                check = true;
                System.out.println("Среди указанного значения есть одинаковые цифры");
            }
            else {
                check = false;
                System.out.println("Среди указаного значения одинаковых цифр не найденно");
            }
            log.info("Проверка на одинаковые цифры прошла успешно: "+check);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Произошла ошибка при проверке на одинаковые цифры");
        }
        return check;
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
        double v = 0;
        try{
            v = l*h*m;
            log.info("Объем бассейна был посчитан: "+v);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при расчете объема бассейна");
        }
        return v;
    }


    /**
     * 8 При поступлении в вуз абитуриенты, получившие двойку на первом экзамене, ко второму не
     * допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     * Подсчитать, сколько человек не допущено ко второму экзамену.
     * @param arr
     * @return
     */
    public int exam(int[] arr) {
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= 2) {
                    count++;
                }

            }
            log.info("Подсчет кол-ва студентов, которые не допущены ко второму экзамену завершен успешно: "+ count);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при подсчете кол-ва студентов, которые не допущены ко второму экзамену");
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
        try{
            for (int i = 1; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                    imax = i;
                }
            }
            log.info("Определение банка с выгодным курсом прошло успешно: "+imax);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при определении банка с выгодным курсом");
        }
        return imax;
    }

    /**
     * 10. Вывести на экран строку S указанное количество раз N
     * @param a
     * @param n
     */
    public boolean printStr (String a, int n){
        boolean r;
        try{
            for (int i = 0; i<n; i++)
            {
                System.out.println(a);
            }
            log.info("Строку было выведенно "+n+" раз");
            r = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при выводе строки");
            r = false;
        }
        return r;
    }

    /**
     * 11 Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     * @param arr
     * @return
     */
    public int maxMin (int[] arr){
        int res = 0;
        try{
            res = arrayMethods.max(arr)+arrayMethods.min(arr);
            log.info("Сумма большего и меньшего значения масива была посчитана: "+res);
            }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при нахождении суммы большего и меньшего значения масива");
        }
        return res;
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
        try{
            if (triangle(a,b,c)){
                double p;
                p = (a+b+c)/2;
                s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            }
            else {
                System.out.println("Треугольник не существует");
            }
            log.info("Метод расчета площади треугольника был выполнен: "+s);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при вычислении плащади треугольника");
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
            double s = -1;
            if(triangleSquare(a, a, a)==-1){
                return s;
            }
            try{
                s = triangleSquare(a, a, a)*6;
                log.info("Площадь шестиугольника расчитана: "+s);
                System.out.println(s);
            }
            catch (Exception ex){
                ex.printStackTrace();
                log.error("Ошибка при расчете шестиугольника");

            }
            return s;
    }

    /**
     * 14. Написать программу вычислех нечетных чисел от ения суммы факториалов вс1 до 9.
     * @return
     */
    public int sumFactorial(){
        int s = 0;
        try{
            for (int i = 1; i<=9; i++){
                if(i%2 != 0){
                    s = factorial(i)+s;
                }
            }
            log.info("Сумма факториалов нечетных чисел была посчитана: "+s);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при вычислении суммы факториалов нечетных чисел");
        }
        return s;
    }

    /**
     * 15 Написать программу которая возвращает стоимость покупки с учетом дисконта
     * Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     * скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     * @param s
     * @return
     */
    public double sale (double s){
        double price = 0;
        try{
            if (s<=1000){
                price = s;
            }
            else if  (s>=1001&&s<=2000) {
                price = s-(s*0.02);
            }
            else if (s>=2001&&s<=5000){
                price = s-(s*0.05);
            }
            else {
                price = s-(s*0.07);
            }
            log.info("Стоимость покупки была посчитана: "+price);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при вычислении стоимости покупки");
        }
        return price;
    }
}









































