package ra.bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int age;
    boolean status;

    public Student(int id, String name, int age, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + "]";
    }
}

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Huy", 18, true));
        studentList.add(new Student(2, "Trang", 29, false));
        studentList.add(new Student(3, "Fi", 30, true));
        studentList.add(new Student(4, "Pi", 10, false));

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                return student1.name.compareTo(student2.name);
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
