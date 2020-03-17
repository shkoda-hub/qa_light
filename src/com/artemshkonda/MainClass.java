package com.artemshkonda;

import org.junit.Assert;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayMethods arrayMethods = new ArrayMethods();
        Volume vol = new Volume();

        Assert.assertEquals("", 1 , methods.factorial(1));
        Assert.assertEquals("", 120,methods.factorial(5) );
        Assert.assertNotEquals("", 120, methods.factorial(6) );

        Assert.assertEquals("", 7.071,  methods.getDistance(4, 7, 9 ,2), 0.01);
        Assert.assertEquals("", 26.66565311407167,  methods.getDistance(2.5, 1.09, 12 ,26.006), 0.00000000000001);

        Assert.assertFalse("Not false", methods.triangle(56, 8, 6));
        Assert.assertTrue("Not true", methods.triangle(5, 8, 6));

        Assert.assertTrue("", methods.printTriangle(5));
        Assert.assertTrue("", methods.printTriangle(1));
        Assert.assertFalse("", methods.printTriangle(0));
        Assert.assertFalse("", methods.printTriangle(-1));

        Assert.assertEquals("", 0.0888, methods.index(20, 15), 0.0001);
        Assert.assertEquals("", 0.0888, methods.index(20, 15), 0.0001);
        Assert.assertTrue("", Double.isInfinite(methods.index(20, 0)) );

        //Assert.assertTrue("", methods.number());

        Assert.assertEquals("", 1, methods.poll(1,1,1), 0.0001);
        Assert.assertEquals("", 100, methods.poll(2,5,10), 0.0001);
        Assert.assertEquals("", 147.4713, methods.poll(2.35,5.0203,12.5), 0.0001);

        int[] arrExam = {2, 5, 3, 5, 10, 6, 1, 0, 3, 2, 1, 10, 12, 8};
        int[] arrExam2 = {3, 5, 3, 5, 10, 6, 5, 3, 3, 6, 7, 10, 12, 8};
        Assert.assertEquals("", 5, methods.exam(arrExam));
        Assert.assertEquals("", 0, methods.exam(arrExam2));

        int[] arrBank = {25, 24, 20, 33, 24, 45, 12, 44, 102, 25, 55, 12, 28, 30};
        int[] arrBank2 = {150, 24, 20, 33, 24, 45, 12, 44, 102, 25, 55, 12, 28, 30};
        int[] arrBank3 = {25, 24, 20, 33, 24, 45, 12, 44, 102, 25, 55, 12, 28, 230};
        Assert.assertEquals("", 8, methods.bank(arrBank));
        Assert.assertEquals("", 0, methods.bank(arrBank2));
        Assert.assertEquals("", 13, methods.bank(arrBank3));

        int[] arrMaxMin = {12, 56, 78, 1, 98};
        int[] arrMaxMin2 = {2, 56, 78, 10, 98};
        Assert.assertEquals("", 99, methods.maxMin(arrMaxMin));
        Assert.assertEquals("", 100, methods.maxMin(arrMaxMin2));

        Assert.assertEquals("", 1.95, methods.triangleSquare(2.2, 5,7.1), 0.01);

        Assert.assertEquals("", 52.61, methods.sqrSixangles(4.5), 0.01);

        Assert.assertEquals("", 368047, methods.sumFactorial());

        Assert.assertEquals("", 999, methods.sale(999), 0.01);
        Assert.assertEquals("", 1000, methods.sale(1000), 0.01);
        Assert.assertEquals("", 980.98, methods.sale(1001), 0.01);
        Assert.assertEquals("", 1470, methods.sale(1500), 0.01);
        Assert.assertEquals("", 1960, methods.sale(2000), 0.01);
        Assert.assertEquals("", 1900.95, methods.sale(2001), 0.01);
        Assert.assertEquals("", 2375, methods.sale(2500), 0.01);
        Assert.assertEquals("", 4750, methods.sale(5000), 0.01);
        Assert.assertEquals("", 4650.93, methods.sale(5001), 0.01);




























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
