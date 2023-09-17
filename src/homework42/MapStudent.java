package homework42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStudent {
    /*
   ** Задача 2 **
   Дан список студентов. Каждая запись в этом списке означает, что студент посетил занятие.
   Необходимо сформировать Map<Student, Integer>, где ключ студент, а значение - количество занятий
   */
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Smith"));
        students.add(new Student("Jones"));
        students.add(new Student("Thomas"));
        students.add(new Student("Jones"));
        students.add(new Student("Williams"));
        students.add(new Student("Smith"));
        students.add(new Student("Thomas"));
        students.add(new Student("Smith"));
        students.add(new Student("Jones"));
        students.add(new Student("Williams"));
        students.add(new Student("Smith"));
        students.add(new Student("Jones"));
        students.add(new Student("Smith"));
        students.add(new Student("Thomas"));

        System.out.println(mapOfAttendance(students));

    }

    public static Map<Student, Integer> mapOfAttendance(List<Student> list) {
        Map<Student, Integer> attendMap = new HashMap<>();
        for (Student student: list) {
            Integer val = attendMap.get(student);
            val = val == null ? 1 : ++val;
            attendMap.put(student, val);
        }
        return attendMap;
    }
}
