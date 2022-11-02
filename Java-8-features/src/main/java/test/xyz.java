package test;

import java.util.stream.IntStream;

public class xyz {
    public static void main(String[] args) {
        
        int start=30;
        int end=40;

        //IntStream.range(start,end).filter(x->x%2==0).forEach(y->System.out.println(y));
        IntStream.range(start,end).filter(x->x%2==0).forEach(System.out::println);


    }
}
