package org.example;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] a, int k) {
        int last;

        if (a.length != 0) {
            for (int i = 0; i < k; i++) {
                last = a[a.length - 1];
                System.arraycopy(a, 0, a, 1, a.length - 1);
                a[0] = last;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        System.out.println("Przed przesunięciami: " + Arrays.toString(a));
        System.out.println("Po przesunięciach: " + Arrays.toString(solution(a, 2)));
    }
}
