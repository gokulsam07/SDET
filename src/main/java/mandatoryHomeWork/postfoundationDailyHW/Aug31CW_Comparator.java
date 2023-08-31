package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aug31CW_Comparator {

    static class Student {
        int id;
        String name;
        double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.cgpa != s2.cgpa) {
               
                return Double.compare(s2.cgpa, s1.cgpa);
            } else if (!s1.name.equals(s2.name)) {
                
                return s1.name.compareTo(s2.name);
            } else {
               
                return Integer.compare(s1.id, s2.id);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 3.8));
        students.add(new Student(102, "Bob", 3.9));
        students.add(new Student(103, "Alice", 3.7));
        students.add(new Student(104, "Bob", 3.9));
        students.add(new Student(105, "Eve", 3.6));

        Collections.sort(students, new StudentComparator());

        for (Student student : students) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }
    }
}
