package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class FrogRiverOne {
    public static int whenToJump(int endpoint, int[] array) {

        HashSet<Integer> leaves = new HashSet<>();
        System.out.println("endpoint: " + endpoint + ", obs: " + Arrays.toString(array));
        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= endpoint) {
                leaves.add(array[i]);
            }
            if (leaves.size() == endpoint) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(whenToJump(2, new int[]{3, 1, 2, 3, 4, 5, 6, 7, 7, 7}));
        System.out.println(whenToJump(4, new int[]{3, 1, 2, 3}));
        System.out.println(whenToJump(4, new int[]{3, 1, 2, 3, 4}));
        System.out.println(whenToJump(4, new int[]{3, 1, 2, 3, 5}));
        System.out.println(whenToJump(8, new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println(whenToJump(8, new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(whenToJump(3, new int[]{2, 3, 4, 1}));
        System.out.println(whenToJump(1, new int[]{1}));
        System.out.println(whenToJump(1, new int[]{2}));
    }
}
