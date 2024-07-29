package practice4.collections;

public class Anagram {
    public static boolean isAnagram(String st) {
        if (st.length() < 26) {
            return false;
        }
        String s = st.toLowerCase();
        int n = s.length();
        boolean present[] = new boolean[26];
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (x >= 'a' && x <= 'z') {
                present[x - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] == true) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcdEfghijklmnopqrstvwxyz";
        System.out.println(isAnagram(s));
    }
}