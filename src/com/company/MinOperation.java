package com.company;

import java.util.List;

public class MinOperation implements MathOperiation {
    @Override
    public Integer calculate(List<Integer> ints) {

        Integer min = Integer.MAX_VALUE;
        for (Integer i : ints) {
            if (i < min)
                min = i;
        }

        return min;


    }

}
