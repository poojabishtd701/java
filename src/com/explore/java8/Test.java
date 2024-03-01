package com.explore.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,6);
        int sum=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
     //or

        Optional<Integer> sum2=list.stream().reduce(Integer::sum);
        int sum3=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum3);

        int mult=list.stream().reduce(1,(a,b)->a*b);

        System.out.println(mult);
    }
}
