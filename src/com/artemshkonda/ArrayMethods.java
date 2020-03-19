package com.artemshkonda;

import org.w3c.dom.ls.LSOutput;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class ArrayMethods {
    Logger log;
    public ArrayMethods(){
        log = Logger.getLogger(getClass());
    }


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
                min = a;
            } else if (b < a) {
                min = b;
            } else {
                a = b;
            }
            log.info("Минимальное число было найдено: "+min);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при нахождении минимального числа");
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
            log.info("Нахождении суммы элемнтов массива, кратных K, завершено: "+sum);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при нахождении суммы элемнтов массива, кратных K");
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
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    count++;
                }
            }
            log.info("Определение размера массива из номеров нулевых элементов прошла успешно: "+count);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при определении размера массива из номеров нулевых элементов");
        }

        int[] arr1 = new int[count];
        int temp = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr1[temp] = i;
                    temp++;
                }
            }
            log.info("Массив из номеров нулевых элементов был создан: "+Arrays.toString(arr1));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при создании массива из номеров нулевых элементов");
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
            log.info("Определение успешно завершено: " + arr[0]);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при определении");
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
             log.info("Проверка сортировки по возрастанию єлементов массива завершена");
         }
         catch (Exception ex){
             ex.printStackTrace();
             log.error("Ошибка при проверсе сортировке массива");
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
            log.info("Вычисления размера массива кратных чилел прошло успешно: "+count);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при вычислении размера массива кратных чисел");
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
            log.info("Создание нового массива кратных чисел прошло успешно: "+Arrays.toString(newArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при создании нового массива кратных чисел");
        }
        return newArr;
    }

    /**
     * 7.Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     * количество замен.
     */
    public int numbersZ(int[] arr, int z) {
        int count = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > z) {
                    arr[i] = z;
                    count++;
                }
            }
            log.info("Замена элементов которые больше числа Z прошла успешно. Кол-во замен: "+count);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при замене элементовк которые больше числа Z");
        }
        return count;
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
            log.info("Подсчет отрицательных, положительных и нулевых элементов завершен. Положительных элементов: "+count[0]+ ". Отрицательных элементов: "+ count[1] + ". Нулевых элементов: " + count[2]);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при подсчете отрицательных, положительных и нулевых элементов");
        }
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
        try {
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
            log.info("Замена местами наибольшего и наименьшего элементов завершена: "+Arrays.toString(arr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при замене местами наибольшего и наименьшего элементов");
        }
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
    public int[] minI(int[] arr) {
        int count = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= i) {
                    count++;
                }
            }
            log.info("Размер нового массива, для которого выполняется условие arr[i] ≤ i, был посчитан:" +count );
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при подсчете размера массива, для которого выполняется условие arr[i] ≤ i");
        }
        int[] newArr = new int[count];
        int j = 0;
        try{
            for (int i = 0; i<arr.length; i++) {
                if (arr[i] <= i) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            log.info("Массив, для которого выполняется условие arr[i] ≤ i был успешно создан: "+Arrays.toString(newArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при создании массива, для которого выполняется условие arr[i] ≤ i");
        }
        return newArr;

    }


    /**
     * 11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     *
     * @param arr
     * @param m
     * @param l
     */
    public int[] rest(int[] arr, int m, int l) {
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % m == l) {
                    count++;
                }
            }
            log.info("Размер нового массива, для чисел которого остаток от деления на число M равен L был посчитан: " +count );
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при выводе на печать чисел, для которых остаток от деления на число M равен L");
        }
        int[] newArr = new int[count];
        int j = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % m == l) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            log.info("Массив, для чисел которого остаток от деления на число M равен L был создан: "+Arrays.toString(newArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при создании массива, для чисел которого остаток от деления на число M равен L был");
        }
        return newArr;
    }


    /**
     * Метод для возврата рандомного массива
     *
     * @param n
     * @return
     */
    public int[] masiv(int n) {
        int[] array = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Ошибка при возврате рандомного массива");
        }
        return array;
    }


    /**
     * 12.Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     */
    public int[] replaceElements(int[] arr) {
        int size = arr.length;
        int temp;
        try {
            for (int i = 0; i < size - 1; i += 2) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            log.info("Замена соседних элементов была завершена: "+Arrays.toString(arr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при замене соседних элементов (а[0] и а[1], а[2] и а[3], …)");
        }
        return arr;
    }

    /**
     * 13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно
     * до нуля.
     *
     * @param arr
     */
    public int[] oneZero(int[] arr) {
        int i = 0;
        int count = 0;
        try {
            while (i<arr.length && arr[i] != 0) {
                i++;
                count++;
            }
            log.info("Подсчет размера нового массива был выполнен");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при подсчете размера нового массива");
        }
        int[] newArr = new int[count];
        int j = 0;
        try {
            while (i<arr.length && arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
            log.info("Новый массив был создан: "+Arrays.toString(newArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("");
        }
        return newArr;
    }


    /**
     * 14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     *
     * @param arr
     */
    public int maxPlusMin(int[] arr) {
        int maxArr = arr[0];
        int minArr = arr[1];
        try{
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
            log.info("mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]) было успешно найдено: "+(maxArr+minArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при нахождении mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1])");
        }
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
        try {
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i]) > max(arr)) {
                    arr[i] = 0;
                }
            }
            log.info("Замена нулями чисел, величина которых по модулю больше максимального числа прошла успешно: "+Arrays.toString(arr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при замене чисел, величина которых по модулю больше максимального числа");
        }
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
        try {
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
            log.info("Сравнение модуля P1 с модулем P2 прошло успешно");
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при сравнении модуля P1 с модулем P2");
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
            try {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > changeI) {
                        changeI = arr[i];
                        idx = i;
                    }
                }
                arr[idx] = 0;
                log.info("Замена первого максимального элемента массива нулем прошла успешно: "+Arrays.toString(arr));
            }
            catch (Exception ex){
                ex.printStackTrace();
                log.error("Ошибка при замене максимального элемента массива нулем ");
            }
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
        try {
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i] % 10) == k) {
                    count++;
                }
            }
            log.info("Размер массива,элементами которого будут элементы исходного,оканчивающиеся на цифру k, был посчитан: "+count);
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Ошибка при определении размера массива, элементами которого будут элементы исходного,оканчивающиеся на цифру k");
        }
        int[] newArr = new int[count];
        int j = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i] % 10) == k) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            log.info("Массив,элементами которого будут элементы исходного,оканчивающиеся на цифру k, был успешно создан: "+Arrays.toString(newArr));
        }
        catch (Exception ex){
            ex.printStackTrace();
            log.info("Ошибка при создании массива, элементами которого будут элементы исходного,оканчивающиеся на цифру k");
        }
        return newArr;
    }
}










