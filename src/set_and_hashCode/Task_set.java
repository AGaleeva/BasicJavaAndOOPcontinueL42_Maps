package set_and_hashCode;

import set_and_hashCode.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_set {
    /*
    С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов.
    */
    public static void main(String[] args) {
        System.out.println(task(List.of("jack", "john", "ann", "jack", "nick")));

        Person viktor = new Person("Viktor", 31);

        List<Person> people = task1(List.of (
                new Person("Jack", 21),
                new Person("John", 22),
                new Person("Ann", 30),
                new Person("Jack", 21),
                new Person("Jack", 21),
                viktor
                ));
        Set<Person> setPeople = new HashSet<>(people);

        System.out.println(setPeople);
        System.out.println(viktor.hashCode());

        viktor.setAge(32);
        System.out.println(viktor.hashCode());
        System.out.println(setPeople.contains(viktor));
        System.out.println(setPeople);
    }
    public static List<String> task(List<String> list) {
        if (list == null) return null;
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Person> task1(List<Person> list) {
        if (list == null) return null;
        Set<Person> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
