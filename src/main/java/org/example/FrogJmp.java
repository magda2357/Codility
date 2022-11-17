package org.example;

public class FrogJmp {
    public static int countJumps(int x, int y, int d) {
        return (y - x) / d + ((y - x) % d == 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        System.out.println(countJumps(10, 30, 8));
        System.out.println(countJumps(10, 10, 1));
        System.out.println(countJumps(10, 15, 10));
        System.out.println(countJumps(10, 20, 3));
    }
}
