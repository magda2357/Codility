package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAvgTwoSliceTest {

    @Test
    public void testAverage() {
        assertEquals(1, MinAvgTwoSlice.average(new int[]{4, 2, 2, 5, 1, 5, 8}));
        assertEquals(4, MinAvgTwoSlice.average(new int[]{-4, 4, -2, 2, 2, -5, 5}));
    }

}