package consultation;

import java.util.HashMap;
import java.util.Map;

public class MyHashSet<E> {
    private Map<E, Object> map = new HashMap<>();

    public boolean add(E element) {
        map.put(element, null);
        return true;
    }
    public boolean contain(E element) {
        return map.containsKey(element);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<E, Object> entry: map.entrySet()) {
            sb.append(entry.getKey()).append(" ");
        }
        return sb.toString();
    }

    /*
    Дана  map <Character, Integer>. Необходимо сформировать случайную строку, где
    соответствующая буква будет встречаться заданное количество  раз.
    {A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

    {a->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck acca k”
    */
}
