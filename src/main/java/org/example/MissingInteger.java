package org.example;

import java.util.Arrays;

public class MissingInteger {

    public static int findMissingInteger(int[] array) {

        Arrays.sort(array);
        int result = array[array.length - 1] + 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) {
                result = 1;
            } else if ((array[i] - array[i - 1]) > 1) {
                result = array[i - 1] + 1;
            }
        }
        return result;
        /*int beginning = Arrays.binarySearch(array, 1);*/
    }

    public static void main(String[] args) {
        System.out.println(findMissingInteger(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(findMissingInteger(new int[]{1, 2, 3}));
        System.out.println(findMissingInteger(new int[]{-1, -3}));
        System.out.println(findMissingInteger(new int[]{1, -3, -6, 4, 1, 2}));
        System.out.println(findMissingInteger(new int[]{1, -3, 6, -4, 1, 2}));
    }
}
