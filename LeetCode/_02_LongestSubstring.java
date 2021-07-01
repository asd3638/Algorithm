package LeetCode;

import java.util.HashSet;
import java.util.Set;

//외부 코드 참고함.
public class _02_LongestSubstring {
    public static int solution(String str) {
        Set set = new HashSet();
        int begin = 0, end = 0;
        int answer = 0;

        while(end < str.length()) {
            if(set.contains(str.charAt(end))) {
                set.remove(str.charAt(begin++));
            } else {
                set.add(str.charAt(end++));
                answer = Math.max(answer, end - begin);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcdbcddsas"));
    }
}
