package ua.opnu.task4;

import ua.opnu.task2.Student;

public class ConsumerClass {
    public static void forEach(Student[] students, ConsumerInterface action) {
        for (Student s : students) {
            action.accept(s);
        }
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Гайтукаєв Мансур", "АІ-241", new int[]{100, 100, 100}),
                new Student("Сівак Вадим", "АІ-241", new int[]{100, 90, 52}),
                new Student("Левентій Дмитро", "АІ-242", new int[]{60, 50, 60}),
                new Student("Карвацька Єлизавета", "АІ-241", new int[]{50, 40, 100})
        };

        ConsumerInterface printFullName = student ->
                System.out.println(student.getName().toUpperCase());

        forEach(group, printFullName);
    }
}