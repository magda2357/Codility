package org.example;

import java.util.Arrays;

public class BinaryGap {
    public static int countMaxBinaryGap(int n) {
        String binaryN = Integer.toBinaryString(n);

        int[] numbers = new int[binaryN.length()];
        Arrays.setAll(numbers, i -> Character.getNumericValue(binaryN.charAt(i)));

        int count = 0;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count = 0;
            } else {
                count++;
            }
            if (count > result && i < numbers.length - 1 && numbers[i + 1] == 1) {
                result = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int test=126567157;
        System.out.println(Integer.toBinaryString(test));
        System.out.println(countMaxBinaryGap(test));
    }
}
