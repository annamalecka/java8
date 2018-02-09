package com.company;

import java.util.List;

public class MaxOperiation implements MathOperiation {

    @Override
    public Integer calculate(List<Integer> ints) {
        return null;
    }

    public static int findMax(int[] ints) {
        Integer max = Integer.MIN_VALUE;
        for (Integer i: ints) {
                 if (i > max)
                     max = i;
        }

        return max;

    }
}
