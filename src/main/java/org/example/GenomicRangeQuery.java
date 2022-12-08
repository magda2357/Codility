package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GenomicRangeQuery {

    public static int[] countMinImpactFactor(String S, int[] P, int[] Q) {

        String substring = "";
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            substring = Arrays.stream(S.substring(P[i], Q[i] + 1)
                            .split(""))
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining());
            substring = String.valueOf(substring.charAt(0));

            switch (substring) {
                case "A":
                    result[i] = 1;
                    break;
                case "C":
                    result[i] = 2;
                    break;
                case "G":
                    result[i] = 3;
                    break;
                default:
                    result[i] = 4;
                    break;
            }

        }

        return result;

    }

    public static int[] countMinImpactFactor2(String S, int[] P, int[] Q) {

        String substring = "";
        String x = "";
        int min = 4;
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {

            substring = S.substring(P[i], Q[i] + 1);
            min = 4;
            for (int j = 0; j < Q[i] + 1 - P[i]; j++) {
                result[i] = 4;
                x = String.valueOf(substring.charAt(j));
                switch (x) {
                    case "A":
                        min = 1;
                        break;
                    case "C":
                        min = 2;
                        break;
                    case "G":
                        min = 3;
                        break;
                }
                if (result[i] >= min) {
                    result[i] = min;
                }
                if (result[i] == min) {
                    continue;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(countMinImpactFactor("CAGCCTAACGTAAGTC", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(countMinImpactFactor2("CAGCCTAACGTAAGTC", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(countMinImpactFactor("CAGCCTAACGTAAGTC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor2("CAGCCTAACGTAAGTC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor("CAGCC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor2("CAGCC", new int[]{2}, new int[]{4})));
        System.out.println(Arrays.toString(countMinImpactFactor("GT", new int[]{0, 0, 1}, new int[]{0, 1, 1})));
        System.out.println(Arrays.toString(countMinImpactFactor2("GT", new int[]{0, 0, 1}, new int[]{0, 1, 1})));

    }
}
