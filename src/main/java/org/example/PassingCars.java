package org.example;

import java.util.Arrays;

public class PassingCars {

    public static int countPassingCars(int[] array) {

        System.out.println(Arrays.toString(array));

        int len = array.length;
        int sum = Arrays.
                stream(array)
                .sum();
        int subsum = 0;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (array[i] == 1) {
                subsum++;
            }
            if (array[i] == 0) {
                count += sum - subsum;
            }
            if (count > 1000000000) {
                count = -1;
                break;
            }
        }
        return count;
    }

    public static int[] produceRandomeArray(int range, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range + 0.5);
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = produceRandomeArray(1, 100000);
        System.out.println(countPassingCars(array));

        System.out.println(countPassingCars(new int[]{0, 1, 0, 1, 1}));
        System.out.println(countPassingCars(new int[]{1, 1}));
        System.out.println(countPassingCars(new int[]{0, 1}));
        System.out.println(countPassingCars(new int[]{1, 0}));

    }
}
