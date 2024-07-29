package practice4.collections;

import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    static void characterCount(String inputString) {
        TreeMap<Character, Integer> tr = new TreeMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (tr.containsKey(c)) {
                tr.put(c, tr.get(c) + 1);
            } else {
                tr.put(c, 1);

            }
        }
        for (Map.Entry entry : tr.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "welcometostackoverflow";
        characterCount(str);
    }
}
