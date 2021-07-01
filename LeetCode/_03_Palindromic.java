package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_Palindromic {

    public static String solution(String s) throws IOException {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str_part = s.substring(i, j);
                if (str_part.charAt(0) == str_part.charAt(str_part.length() - 1)) {
                    StringBuffer sb = new StringBuffer(str_part);
                    String reversed = sb.reverse().toString();
                    if (str_part.equals(reversed)) {
                        if (answer.length() <= str_part.length()) {
                            answer = str_part;
                        }
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
