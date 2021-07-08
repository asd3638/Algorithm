package skillcheck_lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1 {
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String order : orders) {

        }
        return answer;
    }

    public static List<String> getSubStrings(String s, int[] course) {
        List<String> stringList = new ArrayList<>();
        for (int courseNum : course) {
            for (int i = 0; i < s.length(); i++) {
                
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        System.out.println(solution(orders, course));
    }
}
