package ua.opnu.task6;

import java.util.Arrays;
import java.util.function.Function;

public class PowerN {
    static Function<Integer, Integer> powerOfTwo = n -> (int) Math.pow(2, n);

    static int[] processArray(int[] input, Function<Integer, Integer> function) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]);
        }
        return result;
    }

    public static void main(String[] args){
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] powers = processArray(numbers, powerOfTwo);

        System.out.println("n:      " + Arrays.toString(numbers));
        System.out.println("2^n:    " + Arrays.toString(powers));
    }
}