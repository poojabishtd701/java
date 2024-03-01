package com.explore.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueString {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueString=stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}
