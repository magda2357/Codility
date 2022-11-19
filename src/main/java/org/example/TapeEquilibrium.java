package org.example;

import java.util.Arrays;

public class TapeEquilibrium {
    public static int findEquilibrium(int[] array) {

        System.out.println(Arrays.toString(array));

        int sum = Arrays.stream(array).sum();
        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            count += array[i];
            min = Math.min(min, Math.abs(count - (sum - count)));
            if (min == 0) {
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(findEquilibrium(new int[]{2, 3, 1, 5}));
        System.out.println(findEquilibrium(new int[]{-2, 3, 2, -3}));
        System.out.println(findEquilibrium(new int[]{-2, 3, -4, 5}));
        System.out.println(findEquilibrium(new int[]{1, 3}));
        System.out.println(findEquilibrium(new int[]{-1, 1}));
        System.out.println(findEquilibrium(new int[]{-5, -5}));
        System.out.println(findEquilibrium(new int[]{0, 0}));
    }

}
