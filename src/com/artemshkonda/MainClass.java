package com.artemshkonda;

import org.junit.Assert;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayMethods arrayMethods = new ArrayMethods();
        Volume vol = new Volume();

        Assert.assertEquals("Факториал", 1 , methods.factorial(1));
        Assert.assertEquals("", 120,methods.factorial(5) );
        Assert.assertNotEquals("", 120, methods.factorial(6) );

        Assert.assertFalse("Not false", methods.triangle(56, 8, 6));
        Assert.assertTrue("Not true",methods.triangle(5, 8, 6));

        Assert.assertEquals("", 7.071,  methods.getDistance(4, 7, 9 ,2), 0.01);
        Assert.assertEquals("", 0,  methods.getDistance(0, 0, 0 ,0), 0.01);
        Assert.assertNotEquals();

        //Assert.assertEquals("Expected doesnt equals actual", 120, methods.factorial(5));
        //Assert.assertNotEquals("Expected doesnt equals actual", 120, methods.factorial(6));


        //System.out.println(methods.sqrSixangles(0));




        /*arrayMethods.minNumber(7, 7);
        arrayMethods.indexOfZeroElements(arr1);
        arrayMethods.sort(arr1);
        arrayMethods.evenNumber(arr1);
        arrayMethods.numbersZ(arr1, 16);
        arrayMethods.minI(arr1);
        arrayMethods.oneZero(arr1);
        arrayMethods.compare(arr1);
        arrayMethods.change(arr1);
        arrayMethods.numbersK(arr1, 2);

         */









    }
}
