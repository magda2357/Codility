package org.example;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static int[] countMinImpactFactor(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];
        int[][] count = new int[S.length()][4];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'A') {
                count[i][0] = 1;
            } else if (c == 'C') {
                count[i][1] = 1;
            } else if (c == 'G') {
                count[i][2] = 1;
            } else if (c == 'T') {
                count[i][3] = 1;
            }
        }

        for (int i = 1; i < S.length(); i++) {
            for (int j = 0; j < 4; j++) {
                count[i][j] += count[i - 1][j];
            }
        }

        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];

            for (int j = 0; j < 4; j++) {
                int min = 0;

                if (start - 1 >= 0) {
                    min = count[start - 1][j];
                }

                if (count[end][j] - min > 0) {
                    result[i] = j + 1;
                    break;
                }
            }

        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(countMinImpactFactor("CAGCCTAACGTAAGTC", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(countMinImpactFactor("CAGCCTAACGTAAGTC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor("CAGCC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor("GT", new int[]{0, 0, 1}, new int[]{0, 1, 1})));

    }
}
