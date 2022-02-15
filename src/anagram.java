import java.util.HashMap;
import java.util.Set;

public class anagram {
    public static void main(String[] args) {
        String s1 = "basgadhbfgvhads";
        String s2 = "sjdhgvbjdsbhvbvd";
//        String s1 = "cddgk";
//        String s2 = "gcd";////
        System.out.println(remAnagrams(s1, s2));
    }

    public static int remAnagrams(String s, String s1) {
        //add code here.
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (hm.containsKey(s1.charAt(i))) {
                hm.put(s1.charAt(i), hm.get(s1.charAt(i)) - 1);
            } else {
                hm.put(s1.charAt(i),- 1);
            }
        }

        Set<Character> keys = hm.keySet();
        int count = 0;
        for (Character key : keys) {
            count += Math.abs(hm.get(key));
        }
        return count;

    }
}