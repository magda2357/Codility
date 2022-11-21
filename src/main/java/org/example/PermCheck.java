package org.example;

import java.util.Arrays;

public class PermCheck {
    public static int checkIfPermutation(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int result = 0;
        if (array[0] == 1) {
            if (array.length > 1) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i + 1] == array[i] + 1) {
                        result = 1;
                    } else {
                        result = 0;
                        break;
                    }
                }
            }
            if (array.length == 1) {
                result = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPermutation(new int[]{1, 2, 3, 4}));
        System.out.println(checkIfPermutation(new int[]{1, 2, 3, 5}));
        System.out.println(checkIfPermutation(new int[]{2, 3, 4}));
        System.out.println(checkIfPermutation(new int[]{1}));
        System.out.println(checkIfPermutation(new int[]{2}));
    }

}
