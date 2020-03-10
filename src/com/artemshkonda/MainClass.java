package com.artemshkonda;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayMethods arrayMethods = new ArrayMethods();
        Volume vol = new Volume();

        int[] arr1 = {1000, 1000, 2, 1000, 100, 5, 6, 0};
        methods.factorial(5);
        methods.getDistance(1,5,8,9);
        methods.printTriangle(9);
        methods.index(20, 170);
        //methods.number();
        methods.poll(2, 2, 2);






    }
}
