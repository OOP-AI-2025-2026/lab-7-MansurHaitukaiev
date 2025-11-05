package ua.opnu.task1;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePrime {
    static Predicate<Integer> isPrime = n -> {
        if (n == null || n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    };

    public static void main(String[] args){
        int[] nums = { -1, 0, 1, 2, 3, 4, 5, 17, 18, 19 };
        System.out.println("Завдання 1: прості числа з масиву " + Arrays.toString(nums));
        for (int n : nums) {
            if (isPrime.test(n)) {
                System.out.print(n + " ");
            }
        }
    }
}