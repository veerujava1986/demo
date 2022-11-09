package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList(4, 452, 2, 5, 56, 8, 9, 70, 8, 4, 3, 35243);

        List<Integer> result = integersList.stream().filter(e -> e > 40).collect(Collectors.toList());
        Collectors.


    }
}
