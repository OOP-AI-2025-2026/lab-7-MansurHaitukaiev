package ua.opnu.task2;

import java.util.Arrays;
import java.util.function.Predicate;

public class FilterStudentPredicate {
    public static Predicate<Student> hasNoDebts = student -> {
        for (int mark : student.getMarks()) {
            if (mark < 60) {
                return false;
            }
        }
        return true;
    };

    public static Student[] filter(Student[] input, Predicate<Student> p) {
        Student[] result = new Student[input.length];

        int counter = 0;
        for (Student student : input) {
            if (p.test(student)) {
                result[counter] = student;
                counter++;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Гайтукаєв Мансур", "АІ-241", new int[]{100, 100, 100}),
                new Student("Сівак Вадим", "АІ-241", new int[]{100, 90, 52}),
                new Student("Левентій Дмитро", "АІ-242", new int[]{60, 50, 60}),
                new Student("Карвацька Єлизавета", "АІ-241", new int[]{50, 40, 100})
        };

        Student[] withoutDebts = filter(group, hasNoDebts);
        System.out.println("Без заборгованостей:");
        System.out.println(Arrays.toString(withoutDebts));

        Predicate<Student> hasDebts = hasNoDebts.negate();
        Student[] withDebts = filter(group, hasDebts);
        System.out.println("Із заборгованостями:");
        System.out.println(Arrays.toString(withDebts));
    }
}