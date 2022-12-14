package org.example;

public class MinAvgTwoSlice {
    public static int average(int[] a) {

        double avg;
        double min = Integer.MAX_VALUE;
        int result = a.length;

        for (int i = 0; i < a.length - 1; i++) {
            avg = (double) (a[i] + a[i + 1]) / 2;
            if (avg < min) {
                min = avg;
                result = i;
            }
        }
        for (int i = 0; i < a.length - 2; i++) {
            avg = (double) (a[i] + a[i + 1] + a[i + 2]) / 3;
            if (avg < min) {
                min = avg;
                result = i;
            }
        }

        return result;

    }

}
