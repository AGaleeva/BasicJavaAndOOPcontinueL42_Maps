package map;

import java.util.Objects;

public class PersonMap {
    private String name;
    private int age;

    public PersonMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ' ' + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonMap personMap = (PersonMap) o;
        return age == personMap.age && Objects.equals(name, personMap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
