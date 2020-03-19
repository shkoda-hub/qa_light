package com.artemshkonda;

import org.junit.Assert;
import org.junit.ClassRule;

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

        Assert.assertEquals("", 2, arrayMethods.minNumber(12, 2), 0.01);
        Assert.assertEquals("", 3, arrayMethods.minNumber(3, 9), 0.01);
        Assert.assertEquals("", 12, arrayMethods.minNumber(12, 12), 0.01);

        int [] arrSumKr = {10, 12, 44, 11, 45, 15, 99, 7, 25};
        Assert.assertEquals("", 95, arrayMethods.sumKr(arrSumKr, 5));

        int [] arrIndexOfZeroElements = {0, 5, 7, -2, 0, 12, 56, 0, 1, 0, 19, 0};
        int [] expectedIndexOfZeroElements = {0, 4, 7, 9, 11};
        int [] arrIndexOfZeroElements2 = {98, 5, 7, -2, 15, 12, 56, 1, 1, 3, 19, 2};
        int [] expectedIndexOfZeroElements2 = {};
        Assert.assertArrayEquals(expectedIndexOfZeroElements, arrayMethods.indexOfZeroElements(arrIndexOfZeroElements));
        Assert.assertArrayEquals(expectedIndexOfZeroElements2, arrayMethods.indexOfZeroElements(arrIndexOfZeroElements2));

        int [] positiveNegative1 = {-2,12,44,-7,0};
        int [] positiveNegative2 = {0,12,4,5};
        int [] positiveNegative3 = {3,-1,5,-1};
        Assert.assertEquals(-2, arrayMethods.positiveNegative(positiveNegative1));
        Assert.assertEquals(0, arrayMethods.positiveNegative(positiveNegative2));
        Assert.assertEquals(3, arrayMethods.positiveNegative(positiveNegative3));

        int [] sort1 = {1,5,100,100,1001};
        int [] sort2 = {4,9,1,12,56};
        Assert.assertTrue(arrayMethods.sort(sort1));
        Assert.assertFalse(arrayMethods.sort(sort2));

        int[] arrEvenNumber = {6, 12, 5, 65, 14, 100};
        int[] expectedEvenNumber = {6, 12, 14, 100};
        Assert.assertArrayEquals(expectedEvenNumber, arrayMethods.evenNumber(arrEvenNumber));

        int[] arrAssertEquals1 = {76, 12, 4, 32, 11, 10, 56};
        Assert.assertEquals("", 3, arrayMethods.numbersZ(arrAssertEquals1, 15));
        Assert.assertEquals("", 0, arrayMethods.numbersZ(arrAssertEquals1, 150));

        int [] arrFindNumber1 = {2, 0, -7, -12, -9, 0, 78, 14, 76, 0};
        int [] expectedArrFindNumber1 = {4, 3, 3};
        Assert.assertArrayEquals(expectedArrFindNumber1, arrayMethods.findNumber(arrFindNumber1));

        int [] replacement1 = {-8, 12, 16, 23, 98};
        int [] expectedReplacement1 = {98, 12, 16, 23, -8};
        Assert.assertArrayEquals(expectedReplacement1, arrayMethods.replacement(replacement1));

        int [] arrMinI = {-3, 12, 1, 3, -5, 78, 5};
        int [] expectedArrMinI = {-3, 1, 3, -5, 5};
        Assert.assertArrayEquals(expectedArrMinI, arrayMethods.minI(arrMinI));

        int [] arrRest = {15, 67, -2, 0, 98, 14, 24};
        int [] expectedArrRest = {15,24};
        Assert.assertArrayEquals(expectedArrRest, arrayMethods.rest(arrRest,9,6));

        int [] arrReplaceElement = {9, -1, 9, 12, 78, 98, 67};
        int [] expectedArrReplaceElement = {-1, 9, 12, 9, 98, 78, 67};
        Assert.assertArrayEquals(expectedArrReplaceElement, arrayMethods.replaceElements(arrReplaceElement));

        int [] arrOneZero = {1, 2, 7, -9, 0, 7, 0, 2};
        int [] expectedArrOneZero = {1, 2, 7, -9};
        //Assert.assertArrayEquals(expectedArrOneZero, arrayMethods.oneZero(arrOneZero));


        int[] arrMaxPlusMin = {4, 3, 9, -2, 15, 98, 43};
        Assert.assertEquals("", 41, arrayMethods.maxPlusMin(arrMaxPlusMin));

        int [] arrMoreM = {4, 12, 45, 4, -2, 0, 16};
        Assert.assertEquals("", 8640, arrayMethods.moreM(arrMoreM, 10 ));

        int [] arrModuleArr = {-70, 12, -100, 56, 6, 21, 56, -66};
        int [] expectedArrModuleArr = {0, 12, 0, 56, 6, 21, 56, 0};
        Assert.assertArrayEquals(expectedArrModuleArr, arrayMethods.moduleArr(arrModuleArr));

        int [] arrCompare = {-4, 4, 12, 5, -9, -3, 0, 14, -16};
        Assert.assertEquals("", 3360, arrayMethods.compare(arrCompare));

        int [] arrChange = {1, 14, 3, -2, 0, 14, 2};
        int [] expectedArrChange = {1, 0, 3, -2, 0, 14, 2};
        Assert.assertArrayEquals(expectedArrChange, arrayMethods.change(arrChange));

        int [] arrNumbersK = {13, -2, 563, 43, 53, 1, -2, 0, 93};
        int [] expectedArrNumbersK = {13, 563, 43, 53, 93};
        Assert.assertArrayEquals(expectedArrNumbersK, arrayMethods.numbersK(arrNumbersK, 3));

        arrayMethods.oneZero(arrOneZero);
































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
