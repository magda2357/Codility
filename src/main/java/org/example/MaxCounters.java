package org.example;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaxCounters {
    public static int[] countMax(int n, int[] arr) {

        int[] result = new int[n];
        int max = 0;
        int len = arr.length;

        for (int i = 1; i < len; i++) {

            if (arr[i] <= n) {
                result[arr[i] - 1] += 1;
                max = max(result[arr[i] - 1], max);
            } else {
                Arrays.fill(result, max);
            }
        }
        return result;
    }

    public static int[] countMax2(int n, int[] arr) {

        int[] result = new int[n];
        int max = 0;
        for (int j : arr) {

            if (j <= n) {
                result[j - 1] += 1;
                max = max(result[j - 1], max);
            } else {
                Arrays.fill(result, max);
            }

        }
        return result;
    }

    public static int[] produceRandomeArray(int range, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range + 1);
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = produceRandomeArray(100, 100000);

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(countMax(90, array)));
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        long startTime2 = System.nanoTime();
        System.out.println(Arrays.toString(countMax2(90, array)));
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);


        System.out.println(Arrays.toString(countMax(2, new int[]{1, 3})));
        System.out.println(Arrays.toString(countMax(1, new int[]{1})));
        System.out.println(Arrays.toString(countMax(1, new int[]{2, 1})));
        System.out.println(Arrays.toString(countMax(1, new int[]{1, 2})));
    }

}
