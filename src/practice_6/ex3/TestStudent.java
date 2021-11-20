package practice_6.ex3;

import practice_6.ex2.SortingStudentsByGPA;
import practice_6.ex2.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        Student st[] = new Student[30];
        List<Student> stu1 = new ArrayList<>();
        List<Student> stu2 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            st[i] = new Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu1.add(new Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
            stu2.add(new Student((int) (Math.random() * 200), (int) (Math.random() * 200)));

        }
        Comparator<Student> comp = new SortingStudentsByGPA();
        stu1.sort(comp);
        stu2.sort(comp);
        List<Student> stu3 = new ArrayList<>();
        int positionA = 0, positionB = 0;
        for (int i = 0; i < stu1.size() + stu2.size(); i++) {
            if (positionA == stu1.size()) {
                stu3.add(stu2.get(positionB));
                positionB++;
            } else if (positionB == stu2.size()) {
                stu3.add(stu1.get(positionA));
                positionA++;
            } else if (stu1.get(positionA).getBal() > stu2.get(positionB).getBal()) {
                stu3.add(stu1.get(positionA));
                positionA++;
            } else {
                stu3.add(stu2.get(positionB));
                positionB++;
            }
        }
        System.out.println("Id: Ball:");
        for (Student i : stu3) {
            System.out.println(i);
        }
    }
}
