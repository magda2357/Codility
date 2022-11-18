package org.example;

import java.util.Arrays;

public class PermMissingElem {
    public static int findElement(int[] array) {

        Arrays.sort(array);
        int result = 1;

        if (array.length > 0) {
            if (array[array.length - 1] == array.length) {
                result = array[array.length - 1] + 1;
            } else {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] - array[i - 1] == 2) {
                        result = array[i] - 1;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findElement(new int[]{2, 3, 1, 5}));
        System.out.println(findElement(new int[]{2, 3, 1, 4}));
        System.out.println(findElement(new int[]{2, 3, 4, 5}));
        System.out.println(findElement(new int[]{}));
        System.out.println(findElement(new int[]{2}));
        System.out.println(findElement(new int[]{1}));
        System.out.println(findElement(new int[]{1, 3}));
        System.out.println(findElement(new int[]{1, 2}));
        System.out.println(findElement(new int[]{2, 3}));
    }
}
