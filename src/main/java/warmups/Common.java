package  warmups;

import java.util.*;

public class Common {

    public static List<String> list(String... strings) {
        return Arrays.asList(strings);
    }

    public static Map<String, List<String>> map(Map.Entry<String, List<String>>... items) {
        HashMap<String, List<String>> m = new HashMap<>();
        for (Map.Entry<String, List<String>> item: items) {
            m.put(item.getKey(), item.getValue());
        }
        return m;
    }

    public static Map.Entry<String, List<String>> of(String key, List<String> value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    public static String combine(String... words) {
        StringJoiner sj = new StringJoiner(" ");
        for (String word: words) sj.add(word);
        return sj.toString();
    }
}
