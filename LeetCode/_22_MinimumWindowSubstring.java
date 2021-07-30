package LeetCode;

import java.util.HashMap;

public class _22_MinimumWindowSubstring {
    public static String minWindow1(String s, String t) {
        int total = 0;
        int left = 0;
        String minWindow = "";
        int minWindowSize = s.length();

        if (t.length() > s.length()) {
            return minWindow;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            hm1.put(t.charAt(i), hm1.getOrDefault(t.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (hm1.containsKey(s.charAt(right))) {
                Integer hm2OrDefault = hm2.getOrDefault(s.charAt(right), 0);
                if (hm2OrDefault < hm1.get(s.charAt(right))) {
                    total++;
                }
                hm2.put(s.charAt(right), hm2OrDefault + 1);
            }
            //조건을 충족한 경우
            if (total == t.length()) {
                while (!hm1.containsKey(s.charAt(left)) || hm1.get(s.charAt(left)) < hm2.get(s.charAt(left))) {
                    if (hm1.containsKey(s.charAt(left))) {
                        hm2.put(s.charAt(left), hm2.get(s.charAt(left)) - 1);
                    }
                    left++;
                }
                if (minWindowSize >= right - left + 1) {
                    minWindowSize = right - left + 1;
                    minWindow = s.substring(left, right + 1);
                }
            }
        }

        return minWindow;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(minWindow1(s, t));
    }
}
