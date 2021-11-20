package practice_6.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        Student st[] = new Student[30];
        List<Student> stu = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            st[i] = new Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu.add(new Student((int) (Math.random() * 200), (int) (Math.random() * 200)));

        }
        Comparator<Student> comp = new SortingStudentsByGPA();
        stu.sort(comp);
        System.out.println("Id: Ball:");
        for (Student i: stu){
            System.out.println(i);
        }
    }
}