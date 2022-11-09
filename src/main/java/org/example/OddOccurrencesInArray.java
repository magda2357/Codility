package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public static int solution1(int[] tab) {
        Arrays.sort(tab);
        int result;
        int i = 0;
        while (true) {
            if (tab[tab.length - 1] == tab[i]) {
                result = tab[i];
                break;
            } else if (tab[i] == tab[i + 1]) {
                i += 2;
            } else {
                result = tab[i];
                break;
            }
        }
        return result;
    }

    public static int solution2(int[] tab) {
        List<Integer> list = Arrays.stream(tab).boxed().collect(Collectors.toList());
        return list.stream()
                .filter(a -> Collections.frequency(list, a) == 1)
                .collect(Collectors.toList()).get(0);
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 1, 4, 2, 0, 4, 0, 7};

        long startTime=System.nanoTime();
        System.out.println("Solution1: " + solution1(a));
        long endTime=System.nanoTime();
        System.out.println(endTime-startTime);

        long startTime2=System.nanoTime();
        System.out.println("Solution2: " + solution2(a));
        long endTime2=System.nanoTime();
        System.out.println(endTime2-startTime2);
    }
}
