package LeetCode;

import java.util.*;

public class _13_GroupAnagrams {
    public static List<List<String>> solution(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charList = s.toCharArray();
            Arrays.sort(charList);
            String sortedString = new String(charList);
            //hashset에 이미 있는지 없는지 나눔
            //있으면 list꺼내서 add해주고
            //없으면 새로 list 만들어준다.
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                map.put(sortedString, stringList);
            }
        }
        for (List<String> list : map.values()) {
            answer.add(list);
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] stringList = {"Hello", "I", "am", "ma", "kim"};
        System.out.println(solution(stringList).get(0));
    }
}
