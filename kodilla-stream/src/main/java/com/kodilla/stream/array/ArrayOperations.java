package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        Arrays.stream(numbers)
                .forEach(System.out::println);
       return IntStream.range(0, numbers.length)
               .map(i -> numbers[i])
               .average().getAsDouble();
    }
}
