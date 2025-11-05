package ua.opnu.task5;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
    static void predicateConsumer(int[] array, Predicate<Integer> condition, Consumer<Integer> action) {
        for (int value : array) {
            if (condition.test(value)) {
                action.accept(value);
            }
        }
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Consumer<Integer> printSquare = n -> System.out.println("Квадрат " + n + " = " + (n * n));

        System.out.println("Завдання 5: квадрати непарних чисел з " + Arrays.toString(numbers));
        predicateConsumer(numbers, isOdd, printSquare);
        System.out.println();
    }
}