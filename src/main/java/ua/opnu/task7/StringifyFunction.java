package ua.opnu.task7;

import java.util.Arrays;
import java.util.function.Function;

public class StringifyFunction {
    static String[] stringify(int[] input, Function<Integer, String> f) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = f.apply(input[i]);
        }
        return result;
    }

    static String[] words = {
            "нуль","один","два","три","чотири",
            "п'ять","шість","сім","вісім","дев'ять"
    };

    static Function<Integer, String> digitsToWords = n -> {
        if (n < 0 || n > 9) throw new IllegalArgumentException("Число має бути від 0 до 9");
        return words[n];
    };

    public static void main(String[] args){
        int[] digits = {2,1,4,5,6,3,8,9,0,7};
        String[] asWords = stringify(digits, digitsToWords);
        System.out.println("Завдання 7: цифри словами для " + Arrays.toString(digits));
        System.out.println(Arrays.toString(asWords));
    }
}