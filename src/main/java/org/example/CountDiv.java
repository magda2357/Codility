package org.example;

public class CountDiv {

    //    @Test
    public static int returnCountDiv(int a, int b, int k) {
        int result = Math.round((float) (b - a) / (float) k);
        if (a == b && (a == 0 || a % k == 0)) {
            result = 1;
        }
        return result;
    }

    public static int returnCountDiv3(int a, int b, int k) {

        return (b / k) - (a / k);
    }

    public static int returnCountDiv2(int a, int b, int k) {
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
        System.out.println(returnCountDiv2(10, 10, 5));
        System.out.println(returnCountDiv(10, 10, 7));
        System.out.println(returnCountDiv2(10, 10, 7));
        System.out.println(returnCountDiv(10, 10, 20));
        System.out.println(returnCountDiv2(10, 10, 20));
        System.out.println(returnCountDiv(0, 0, 11));
        System.out.println(returnCountDiv2(0, 0, 11));
        System.out.println(returnCountDiv(1, 1, 11));
        System.out.println(returnCountDiv2(1, 1, 11));
        System.out.println(returnCountDiv(6, 11, 2));
        System.out.println(returnCountDiv2(6, 11, 2));
        System.out.println(returnCountDiv(1, 100, 20));
        System.out.println(returnCountDiv2(1, 100, 20));
        System.out.println(returnCountDiv(11, 345, 17));
        System.out.println(returnCountDiv2(11, 345, 17));
        System.out.println(returnCountDiv(1, 14, 2));
        System.out.println(returnCountDiv2(1, 14, 2));
        System.out.println(returnCountDiv(1, 14, 3));
        System.out.println(returnCountDiv2(1, 14, 3));
//        System.out.println(returnCountDiv(1,2000000000,3));
//        System.out.println(returnCountDiv2(1,2000000000,3));
//        System.out.println(returnCountDiv(1,2000000000,2));
//        System.out.println(returnCountDiv2(1,2000000000,2));
//        System.out.println(returnCountDiv(1,2000000000,1200000000));
//        System.out.println(returnCountDiv2(1,2000000000,1200000000));
    }

}
