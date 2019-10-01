package com.brunoyam.unit_1.utils;

import java.util.Random;

public abstract class Generator {

    public static int[] getOneDimensionArray() {
        Random random = new Random();

        int[] oneDimensionArray = new int[random.nextInt(100)];
        for(int i = 0; i < oneDimensionArray.length; i++) {
            oneDimensionArray[i] = random.nextInt();
        }

        int negativePosition = random.nextInt(100);
        while (oneDimensionArray[negativePosition] >= 0) {
            oneDimensionArray[negativePosition] = random.nextInt();
        }

        int positivePosition = random.nextInt(100);
        while (positivePosition == negativePosition) {
            positivePosition = random.nextInt(100);
        }
        while (oneDimensionArray[positivePosition] <= 0) {
            oneDimensionArray[positivePosition] = random.nextInt();
        }

        int zeroPozition = random.nextInt(100);
        while (zeroPozition == positivePosition || zeroPozition == negativePosition) {
            zeroPozition = random.nextInt(100);
        }
        oneDimensionArray[zeroPozition] = 0;

        return oneDimensionArray;
    }

    public static int[][] getTwoDimensionsArray() {
        Random random = new Random();

        int[][] twoDimensionsArray = new int[random.nextInt(100)][random.nextInt(10)];
        for(int i = 0; i < twoDimensionsArray.length; i++) {
            for(int j = 0; j < twoDimensionsArray[i].length; j++) {
                twoDimensionsArray[i][j] = random.nextInt();
            }
        }

        return twoDimensionsArray;
    }

}
