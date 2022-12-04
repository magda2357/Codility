package org.example;

public class CountDiv {

    public static int returnCountDiv(int a, int b, int k) {

        int result = 0;

        if (a > 0) {
            result = (b - (b % k)) / k - (a - 1 - (a - 1) % k) / k;
            if (a == b && a % k == 0) {
                result = 1;
            }
        } else if (a == 0) {
            result = (b - (b % k)) / k + 1;
        }

        return result;
    }

    public static int returnCountDivInefficient(int a, int b, int k) {

        int result = 0;

        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(returnCountDiv(10, 10, 5));
        System.out.println(returnCountDivInefficient(10, 10, 5));
        System.out.println(returnCountDiv(10, 10, 7));
        System.out.println(returnCountDivInefficient(10, 10, 7));
        System.out.println(returnCountDiv(10, 10, 20));
        System.out.println(returnCountDivInefficient(10, 10, 20));
        System.out.println(returnCountDiv(0, 0, 11));
        System.out.println(returnCountDivInefficient(0, 0, 11));
        System.out.println(returnCountDiv(1, 1, 11));
        System.out.println(returnCountDivInefficient(1, 1, 11));
        System.out.println(returnCountDiv(6, 11, 2));
        System.out.println(returnCountDivInefficient(6, 11, 2));
        System.out.println(returnCountDiv(11, 345, 17));
        System.out.println(returnCountDivInefficient(11, 345, 17));
        System.out.println(returnCountDiv(1, 20, 3));
        System.out.println(returnCountDivInefficient(1, 20, 3));
        System.out.println(returnCountDiv(1, 20, 2));
        System.out.println(returnCountDivInefficient(1, 20, 2));
        System.out.println(returnCountDiv(100, 123456789, 2));
        System.out.println(returnCountDivInefficient(100, 123456789, 2));
        System.out.println(returnCountDiv(101, 123456789, 10000));
        System.out.println(returnCountDivInefficient(101, 123456789, 10000));
        System.out.println(returnCountDiv(0, 2000000000, 1));
        System.out.println(returnCountDivInefficient(0, 2000000000, 1));
        System.out.println(returnCountDiv(0, 2000000000, 2000000000));
        System.out.println(returnCountDivInefficient(0, 2000000000, 2000000000));
    }

}
