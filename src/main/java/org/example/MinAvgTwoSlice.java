package org.example;

public class MinAvgTwoSlice {
    public static int average(int[] a) {

        double min = a.length;
        double avg = Integer.MAX_VALUE;
        double sum;
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            sum = a[i];
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum / (j - i + 1) < avg) {
                    avg = sum / (j - i + 1);
                }
            }
            if (avg < min) {
                min = avg;
                result = i;
            }
        }

        return result;
    }

}
