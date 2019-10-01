package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Main {

    /*
    Условия:
    oneDimensionArray - массив содержащий не меньше 3 и не больше 99 элементов типа int.
    Среди них всегда есть хотя бы одно положительное, хотя бы одно отрицательное и хотя бы один 0.

    Подсказки:

    Для выполнения задания вспомните максимальные и минимальные значения целочисленных типов.

    Длина массива хранится в поле length. Например, длину массива myArray можно получить так: int myArrayLength = myArray.length

    Для выходя из метода используется ключевое слово return. Если после него стоит значение (или переменная), то это значение будет возвращено как результат работы метода.

    Метод main расположен последним в классе (находится в самом низу)

     */

    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    private static void level1() {
        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        */
        /*тип*/ minValue = findMinValue(oneDimensionArray);
        /*тип*/ maxValue = findMaxValue(oneDimensionArray);
        /*тип*/ sumOfValues = sumValues(oneDimensionArray);
        /*тип*/ firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        /*тип*/ firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ findMinValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ minValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         */
        return minValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ findMaxValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ maxValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         */
        return maxValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ sumValues(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ sum = 0;
        /* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму всех значений в переменную sum. */
        return sum;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ getFirstPositiveIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ firstPositiveIndex = 0;
        /* Используя цикл while найдите индекс первого положительного значения в массиве и сохраните в переменную firstPositiveIndex */
        return firstPositiveIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static /*тип*/ getFirstNegativeIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        /*тип*/ firstNegativeIndex = 0;
        /* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex */
        return firstNegativeIndex;
    }

    public static void main(String[] args) {
        level1();
    }

}
