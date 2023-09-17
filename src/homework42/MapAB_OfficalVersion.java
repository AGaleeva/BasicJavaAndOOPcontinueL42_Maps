package homework42;

import java.util.HashMap;
import java.util.Map;

public class MapAB_OfficalVersion {
    public static void main(String[] args) {

        System.out.println("================================ mapAB ================================");
        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        System.out.println(mapAB);
        mapHandler(mapAB, "a", "b");
        System.out.println(mapAB);

        System.out.println("================================ mapA ================================");
        Map<String, String> mapA = new HashMap<>();
        mapA.put("a", "Hi");
        System.out.println(mapA);
        mapHandler(mapA, "a", "b");
        System.out.println(mapA);

        System.out.println("================================ mapB ================================");
        Map<String, String> mapB = new HashMap<>();
        mapB.put("b", "There");
        System.out.println(mapB);
        mapHandler(mapB, "a", "b");
        System.out.println(mapB);

        System.out.println("================================ mapAB with second method ================================");
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        System.out.println(mapAB);
        mapHandler1(mapAB, "a", "b");
        System.out.println(mapAB);

        System.out.println("================================ mapA with second method ================================");
        mapA.put("a", "Hi");
        System.out.println(mapA);
        mapHandler1(mapA, "a", "b");
        System.out.println(mapA);

        System.out.println("================================ mapB with second method ================================");
        mapB.put("b", "There");
        System.out.println(mapB);
        mapHandler1(mapB, "a", "b");
        System.out.println(mapB);
    }

    public static void mapHandler(Map<String, String> map, String key1, String key2) {
        if (map != null && map.containsKey(key1) && map.containsKey(key2)) {
            map.put(key1 + key2, map.get(key1) + map.get(key2));
        }
    }

    public static void mapHandler1(Map<String, String> map, String key1, String key2) {
        if (map == null) return;
        String val1 = map.get(key1);
        String val2 = map.get(key2);
        if (val1 != null && val2 != null) {
            map.put(key1 + key2, val1 + val2);
        }
    }
}
