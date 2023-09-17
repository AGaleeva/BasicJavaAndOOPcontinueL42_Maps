package consultation;

import java.util.*;

public class T3_FromConsultation {
    /*
    Задача
    Дана  Map <Character, Integer>. Необходимо сформировать случайную строку, где
    соответствующая буква будет встречаться заданное количество  раз.
    {A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

    {a->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck acca k”
    */

    public static void main(String[] args) {

        Map<Character, Integer> mapChars = new HashMap<>();
        mapChars.put('A', 2);
        mapChars.put('b', 1);
        mapChars.put('k', 2);
        mapChars.put('c', 3);
        mapChars.put(' ', 2);

        System.out.println(mapChars);
//        System.out.println(printRandomString(mapChars));
        System.out.println(printRandomString1(mapChars));
    }

    public static String printRandomString(Map<Character, Integer> map) {
        Set<CharContainer> charSet = new HashSet<>();
        StringBuilder randCharString = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Character ch = entry.getKey();
            Integer val = entry.getValue();
            for (int i = 0; i < val; i++) {
                charSet.add(new CharContainer(ch));
            }
        }
        for (CharContainer ch : charSet) {
            randCharString.append(ch.getCharacter());
        }
        return randCharString.toString().toLowerCase();
    }

    public static String printRandomString1(Map<Character, Integer> map) {
        Random random = new Random();
        List<Character> charList = new ArrayList<>();
        StringBuilder randCharString = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Character ch = entry.getKey();
            Integer val = entry.getValue();
            for (int i = 0; i < val; i++) {
                charList.add(ch);
            }
        }
        while (charList.size() > 0) {
            int index = random.nextInt(0, charList.size());
            randCharString.append(charList.remove(index));
        }
        return randCharString.toString().toLowerCase();
    }
}
