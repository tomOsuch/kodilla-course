package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        Arrays.stream(numbers).boxed()
                .forEach(System.out::println);
       OptionalDouble averagetab = IntStream.range(0, numbers.length)
               .mapToLong(i -> numbers[i])
               .average();
       return averagetab.getAsDouble();
    }
}
