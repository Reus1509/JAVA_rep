package org.example.seminar3.cw3.model2;

import java.util.ArrayList;
import java.util.List;

// Вывести на экран стипендию студентов,
// фамилии которых заканчиваются на ова и сумма баллов четная

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Кузнецов", 2, 12000, List.of(4, 5, 4));
        Student student2 = new Student("Филимонова", 3, 9000, List.of(5, 5, 4));
        Student student3 = new Student("Петров", 3, 15000, List.of(4, 5, 4));
        Student student4 = new Student("Александрова", 1, 5000, List.of(3, 5, 3));

        List<Student> allStudents = new ArrayList<Student>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);

        for (Student student:allStudents) {
            if(strStudent(student.getSurname(), "ова")){
                Integer sum = 0;
                for (Integer count:student.getBall()
                     ) {
                    sum += count;
                }
                if (sum % 2 == 0){
                    System.out.println(student.getSurname() + " - stip = " + student.getMoney());
                }
            }
        }

    }

    public static boolean strStudent(String str, String search){
        int count = str.length() - search.length();
        if (str.substring(count).equals(search)) return true;
        return false;
    }
}
