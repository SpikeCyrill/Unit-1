package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Unit_1 {

    public static void main(String[] args) {
        int[] oneDimensionArray = Generator.getOneDimensionArray();
        int minValue = findMinValue(oneDimensionArray);
        int maxValue = findMaxValue(oneDimensionArray);
        long sumOfValues = sumValues(oneDimensionArray);
        byte firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        byte firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);
        byte lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
        byte lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("total positives: " + positiveNegativeNumber[1]);
        System.out.println("total negatives: " + positiveNegativeNumber[0]);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
        System.out.println("last negative index: " + lastNegativeIndex);

        int[][] twoDimensionsArray = Generator.getTwoDimensionsArray();
        long[] arrayOfSums = sumSubArrays(twoDimensionsArray);

        System.out.println();
        System.out.println("Second part");
        System.out.println("result: " + Arrays.toString(arrayOfSums));


    }

    private static int findMinValue(int[] arrayOfValues) {
        int minValue = arrayOfValues[0];
        for (int i = 1; i < arrayOfValues.length; i++) {
            if (minValue > arrayOfValues[i]) minValue = arrayOfValues[i];
        }
        return minValue;
    }

    private static int findMaxValue(int[] arrayOfValues) {
        int maxValue = arrayOfValues[0];
        for (int i = 1; i < arrayOfValues.length; i++) {
            if (maxValue < arrayOfValues[i]) maxValue = arrayOfValues[i];
        }
        return maxValue;
    }

    private static long sumValues(int[] arrayOfValues) {
        int sum = 0;
        for (int i = 0; i < arrayOfValues.length; i++) {
            sum = sum + arrayOfValues[i];
        }
        return sum;
    }

    private static byte getFirstPositiveIndex(int[] arrayOfValues) {
        byte firstPositiveIndex = 0;
        while (arrayOfValues[firstPositiveIndex] < 0) {
            firstPositiveIndex++;
        }
        return firstPositiveIndex;
    }

    private static byte getLastPositiveIndex(int[] arrayOfValues) {
        byte lastPositiveIndex = (byte) (arrayOfValues.length - 1);
        while (arrayOfValues[lastPositiveIndex] < 0) {
            lastPositiveIndex--;
        }
        return lastPositiveIndex;
    }

    private static byte getFirstNegativeIndex(int[] arrayOfValues) {
        byte firstNegativeIndex = 0;
        while (arrayOfValues[firstNegativeIndex] >= 0) {
            firstNegativeIndex++;
        }
        return firstNegativeIndex;
    }

    private static byte getLastNegativeIndex(int[] arrayOfValues) {
        byte lastNegativeIndex = (byte) (arrayOfValues.length - 1);
        while (arrayOfValues[lastNegativeIndex] >= 0) {
            lastNegativeIndex--;
        }
        return lastNegativeIndex;
    }


    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];

        for (int i = 0; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] < 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }

    private static long[] sumSubArrays(int[][] arrayOfValues) {
        long[] arrayOfSums = new long[arrayOfValues.length];
        for (int i = 0; i < arrayOfValues.length; i++) {
            for (int j = 0; j < arrayOfValues[i].length; j++) {
                arrayOfSums[i] = arrayOfSums[i] + arrayOfValues[i][j];
            }
        }
        return arrayOfSums;
    }

}
