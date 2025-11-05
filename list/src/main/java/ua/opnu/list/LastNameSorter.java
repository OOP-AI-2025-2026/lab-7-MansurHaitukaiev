package ua.opnu.list;

import java.util.Comparator;

public class LastNameSorter implements Comparator {

    private final boolean order; // true = зростання, false = спадання

    public LastNameSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object object1, Object object2) {
        if (object1 instanceof Student && object2 instanceof Student) {
            Student student1 = (Student) object1;
            Student student2 = (Student) object2;

            if (order) {
                return student1.getLastName().compareTo(student2.getLastName());
            } else {
                return student2.getLastName().compareTo(student1.getLastName());
            }
        }
        return 0;
    }
}
