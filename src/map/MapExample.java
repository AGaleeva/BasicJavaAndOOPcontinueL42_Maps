package map;

import set_and_hashCode.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        Map<String, PersonMap> map2 = new HashMap<>();
        Map<PersonMap, Integer> map3 = new HashMap<>();
        Map<String, List<PersonMap>> map4 = new HashMap<>();

        map1.put("que-1", "123-123123");
        map1.put("que-2", "123-123123782431");
        map1.put("que-3", "123-7373");
        map1.put("que-4", "1277373");

        System.out.println(map1);

        // get element form map: always by key
        System.out.println(map1.get("que-3"));

        // iterate through map

        // Variant 1
        Set<String> keyMap1 = map1.keySet();
        for (String key : keyMap1) {
            System.out.println(key + ": " + map1.get(key));
        }
        System.out.println();

        // Variant 2. More preferable, because you do not need to go to map each time.
        Set<Map.Entry<String, String>> entriesMap1 = map1.entrySet();
        for (Map.Entry<String, String> entry : entriesMap1) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("============================================");

        PersonMap person = new PersonMap("Jack", 21);
        List<PersonMap> people = List.of(
                new PersonMap("Jack", 21),
                new PersonMap("John", 23),
                new PersonMap("Nick", 25),
                new PersonMap("Ann", 19)
        );
        for (PersonMap p : people) {
            map3.put(p, p.getAge());
        }
        System.out.println(map3);
        System.out.println();
        map3.put(person, person.getAge());
        System.out.println(map3);
    }
}
