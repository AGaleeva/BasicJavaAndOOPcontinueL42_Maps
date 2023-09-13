package homework42;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapAB {
    /*
    ** Задача 1 **

       Дана Map<String, String>, если в ней есть ключ "a" и "b", то нужно создать новый ключ ‘ab’
       с суммой значений от ключей a и b.
       Примеры: mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
       mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
    */

    public static void main(String[] args) {
        System.out.println("================================ mapAB ================================");
        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        System.out.println(mapAB);
        keySum(mapAB,"a", "b");
        System.out.println(mapAB);

        System.out.println("================================ mapA ================================");
        Map<String, String> mapA = new HashMap<>();
        mapA.put("a", "Hi");
        System.out.println(mapA);
        keySum(mapA,"a", "b");
        System.out.println(mapA);

        System.out.println("================================ mapB ================================");
        Map<String, String> mapB = new HashMap<>();
        mapB.put("b", "There");
        System.out.println(mapB);
        keySum(mapB,"a", "b");
        System.out.println(mapB);

    }

    public static void keySum(Map<String, String> map, String key1, String key2) {
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        String val1 = null;
        String val2 = null;
        for (Map.Entry<String, String> entry : entrySet) {
            val1 = entry.getKey().equals(key1) ? entry.getValue() : val1;
            val2 = entry.getKey().equals(key2) ? entry.getValue() : val2;
            if (val1 != null && val2 != null) {
                map.put("a" + "b", val1 + val2);
            }
        }
    }
}
