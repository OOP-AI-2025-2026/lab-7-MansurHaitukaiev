package ua.opnu.task3;

import java.util.Arrays;
import java.util.function.Predicate;

public class TwoPredicateFilter {
    static int[] filterByTwo(int[] input, Predicate<Integer> p1, Predicate<Integer> p2) {
        int[] tmp = new int[input.length];
        int count = 0;
        for (int value : input) {
            if (p1.test(value) && p2.test(value)) {
                tmp[count++] = value;
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    public static void main (String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThanFive = n -> n > 5;

        int[] filtered = filterByTwo(numbers, isEven, greaterThanFive);
        System.out.println("Завдання 3: парні та > 5 з " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(filtered));
        System.out.println();
    }
}