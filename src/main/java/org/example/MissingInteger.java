package org.example;

import java.util.Arrays;

public class MissingInteger {

    public static int findMissingInteger(int[] array) {

        int[] arrayShort = Arrays.stream(array).
                sorted()
                .distinct()
                .filter(a -> a > 0)
                .toArray();
        System.out.println("Array: " + Arrays.toString(arrayShort) + ", result: ");

        int len = arrayShort.length;
        int result = 1;

        if (len > 0) {
            if (arrayShort[len - 1] == len) {
                result = len + 1;
            } else if (arrayShort[0] == 1) {
                for (int i = 1; i < len; i++) {
                    if ((arrayShort[i] - arrayShort[i - 1]) > 1) {
                        result = arrayShort[i - 1] + 1;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(findMissingInteger(new int[]{-2, -1, 0, 1, 3, 6, 4, 1, 2}));
        System.out.println(findMissingInteger(new int[]{1, 2, 3}));
        System.out.println(findMissingInteger(new int[]{4, 5, 6, 2}));
        System.out.println(findMissingInteger(new int[]{-1}));
        System.out.println(findMissingInteger(new int[]{0}));
        System.out.println(findMissingInteger(new int[]{1}));
        System.out.println(findMissingInteger(new int[]{2}));
        System.out.println(findMissingInteger(new int[]{-1, -3}));
        System.out.println(findMissingInteger(new int[]{1, -3, -6, 4, 1, 2}));
        System.out.println(findMissingInteger(new int[]{1, -3, -6, 4, 1, 2}));
        System.out.println(findMissingInteger(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
