package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> st1=Arrays.asList("one","two","three");
        //st1.stream().forEach(s-> System.out.println(s));
        //st1.stream().map(s->s.concat("X")).forEach(s-> System.out.println(s));
        IntStream.range(20,30).filter(i->i%2==0).forEach(i-> System.out.println(i));

       // Stream.of(90);
    }
}
