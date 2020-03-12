package com.artemshkonda;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayMethods {


    /**
     * 1. Дано два числа. Найти минимальное число из них.
     *
     * @param a
     * @param b
     * @return
     */
    public double minNumber(double a, double b) {
        double min = b;
        try{
            if (a < b) {
                System.out.println("Минимальное число: " + a);
                min = a;
            } else if (b < a) {
                System.out.println("Минимальное число: " + b);
                min = b;
            } else {
                System.out.println("а и b равны между собой");
                a = b;
            }
            System.out.println("Минимальное число было найдено");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при нахождении минимального числа");
        }
        return min;
    }


    /**
     * 2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     *
     * @param arr
     * @param k
     * @return
     */
    public int sumKr(int[] arr, int k) {
        int sum = 0;
        try{
            int l = arr.length;
            for (int i = 0; i < l; i++) {
                if (arr[i] % k == 0) {
                    sum += arr[i];
                }
            }
            System.out.println("Нахождении суммы элемнтов массива, кратных K, завершено");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при нахождении суммы элемнтов массива, кратных K");
        }
        return sum;


    }

    /**
     * 3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     *
     * @param arr
     * @return
     */
    public int[] indexOfZeroElements(int[] arr) {
        int count = 0;
        int[] arr1 = new int[count];
        int temp = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    count++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr1[temp] = i;
                    System.out.print(arr1[temp] + " ");
                    temp++;
                }
            }
            System.out.println("Массив из номеров нулевых элементов был создан");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при создании массива из номеров нулевых элементов");
        }
        return arr1;
    }

    /**
     * 4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     * встречается раньше – положительное или отрицательное.
     *
     * @return
     */
    public int positiveNegative(int[] arr) {
        try {
            if (arr[0] > 0) {
                System.out.println("Первое число в массиве является положительным");
            } else if (arr[0] < 0) {
                System.out.println("Первое число в массиве является отрицательным");
            } else {
                System.out.println("Первое чсилов в массиве равно нулю");
            }
            System.out.println("Определение успешно завершено");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при определении");
        }
        return arr[0];
    }

    /**
     * 5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     *
     * @param arr
     */
    public boolean sort(int[] arr) {
         int i = 1;
         try {
             while(i<arr.length && arr[i]>=arr[i-1]){
                 i++;
             }
             System.out.println(i == arr.length);
             System.out.println("Проверка сортировки по возрастанию єлементов массива завершена");
         }
         catch (Exception ex){
             ex.printStackTrace();
             System.out.println("Ошибка при проверсе сортировке массива");
         }
         return i == arr.length;
    }

    /**
     * 6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     * сообщение об этом факте.
     *
     * @param arr
     * @return
     */
    public int[] evenNumber(int[] arr) {
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("В массиве нет чисел кратных двум");
            }
            System.out.println("Вычисления размера массива кратных чилел прошло успешно");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при вычислении размера массива кратных чисел");
        }
        int[] newArr = new int[count];
        int j = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            System.out.println("Создание нового массива кратных чисел прошло успешно");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при создании нового массива кратных чисел");
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    /**
     * 7.Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     * количество замен.
     */
    public int[] numbersZ(int[] arr, int z) {
        int count = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > z) {
                    arr[i] = z;
                    count++;
                }
            }
            System.out.println("Замена элементов которые больше числа Z прошла успешно");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при замене элементовк которые больше числа Z");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Кол-во замен: " + count);
        return arr;
    }

    /**
     * 8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     * элементов.
     *
     * @param a
     * @return
     */
    public int[] findNumber(int[] a) {
        int[] count = new int[3];
        count[0] = count[1] = count[2] = 0;
        int size = a.length;
        try {
            for (int i = 0; i < size; i++) {
                if (a[i] > 0) {
                    count[0]++;
                } else if (a[i] < 0) {
                    count[1]++;
                } else count[2]++;
            }
        }
        System.out.println("Positive elements: " + count[0]);
        System.out.println("Negative elements: " + count[1]);
        System.out.println("Zero elements: " + count[2]);
        return count;
    }

    /**
     * 9.Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     *
     * @param arr
     */
    public int[] replacement(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            } else if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        arr[imin] = max;
        arr[imax] = min;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * метод для возврата минимального значения массива
     *
     * @param arr
     * @return
     */
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        return min;
    }

    /**
     * метод для возврата максимального значения массива
     *
     * @param arr
     * @return
     */
    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    /**
     * 10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     *
     * @param arr
     */
    public int minI1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= i) {
                System.out.print(arr[i] + " ");
            }
        }
        return -1;
    }


    /**
     * 11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     *
     * @param arr
     * @param m
     * @param l
     */
    public int rest(int[] arr, int m, int l) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % m == l) {
                System.out.print(arr[i] + " ");
            }
        }
        return -1;
    }


    /**
     * Метод для возврата рандомного массива
     *
     * @param n
     * @return
     */
    public int[] masiv(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        return array;
    }


    /**
     * 12.Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     */
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        int temp;
        for (int i = 0; i < size - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
        return arr;
    }

    /**
     * 13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно
     * до нуля.
     *
     * @param arr
     */
    public int oneZero(int[] arr) {
        int idx = 0;
        while (idx<arr.length && arr[idx] != 0) {
            System.out.print(arr[idx] + " ");
            idx++;
        }
        return -1;
    }


    /**
     * 14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     *
     * @param arr
     */
    public int maxPlusMin(int[] arr) {
        int maxArr = arr[0];
        int minArr = arr[1];
        for (int i = 2; i < arr.length; i += 2) {
            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }
        }
        for (int i = 3; i < arr.length; i += 2) {
            if (minArr > arr[i]) {
                minArr = arr[i];
            }
        }
        System.out.println(maxArr + minArr);
        return maxArr + minArr;


    }


    /**
     * 15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше
     * заданного числа М. Если таких нет, то выдать сообщение об этом.
     *
     * @param arr
     */
    public int moreM(int[] arr, int m) {
        int num = 1;
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                num = arr[i] * num;
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println(num);
        } else {
            System.out.println("В массиве нет значений, которые больше " + m);
        }
        return num;
    }

    /**
     * 16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
     * по модулю больше максимального числа (|a[i]|>max{ a[0], a[1], ..., a[n]})
     *
     * @param arr
     */
    public int[] moduleArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max(arr)) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    /**
     * 17. Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение
     * отрицательных элементов P 1  и произведение положительных элементов Р 2 . Сравнить модуль Р 2  с
     * модулем Р 1  и указать, какое из произведений по модулю больше.
     *
     * @param arr
     */
    public int compare(int[] arr) {
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                p1 = arr[i] * p1;
            } else if (arr[i] > 0) {
                p2 = arr[i] * p2;
            }
        }
        if (Math.abs(p1) > Math.abs(p2)) {
            System.out.println("Значение p1 больше чем p2 и равно " + Math.abs(p1));
        } else {
            System.out.println("Значение p2 больше чем p1 и равно " + Math.abs(p2));
        }
        return -1;
    }

    /**
     * 18. Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и
     * заменить его нулем.
     *
     * @param arr
                * @return
     */
        public int[] change(int[] arr) {
            int changeI = arr[0];
            int idx = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > changeI) {
                    changeI = arr[i];
                    idx = i;
                }
            }
            arr[idx] = 0;
            System.out.println(Arrays.toString(arr));
            return arr;
    }

    /**
     * 19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k.
     *
     * @return
     */
    public int[] numbersK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == k) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == k) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;

    }
}










