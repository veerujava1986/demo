package com.example.root;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String name="veeraiah";
        IntStream chars = name.chars();


        HashMap<Character,Integer> map=new HashMap<>();

        chars.map(c->(char)c).forEach(c->{
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1){

                }
            }

        });


    }
}