package Greedy;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class makeBigNum {
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        //이런 식으로 짜면 순서가 무시됨...
        /*PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < number.length(); i++) {
            pq.add(Character.getNumericValue(number.charAt(i)));
        }
        for (int i = 0; i < number.length() - k; i++) {
            answer += pq.poll();
        }*/
        for (int i = 0; i < number.length() - k; i++) {
            char max = '0';
            for (int j = idx; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            answer.append(max + "");
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("1231234", 3));
    }
}
