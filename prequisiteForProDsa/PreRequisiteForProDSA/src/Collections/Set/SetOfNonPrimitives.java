package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOfNonPrimitives {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ayush", 102));
        students.add(new Student("Varmora", 104));
        students.add(new Student("Akki", 105));
        students.add(new Student("Munni", 102));
        System.out.println(students);


    }
}
