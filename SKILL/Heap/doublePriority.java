package SKILL.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class doublePriority {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < operations.length; i++) {
            String seq = operations[i].split(" ")[0];
            int num = Integer.parseInt(operations[i].split(" ")[1]);
            if (seq.equals("D")) {
                if (!minpq.isEmpty()) {
                    if (num >= 0) {
                        //큐에서 최댓값 제거
                        int max = maxpq.poll();
                        minpq.remove(max);
                        
                    } else {
                        //큐에서 최솟값 제거
                        int min = minpq.poll();
                        maxpq.remove(min);
                    }
                }
            } else {
                minpq.offer(num);
                maxpq.offer(num);
            }
        }
        if (minpq.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = maxpq.peek();
            answer[1] = minpq.peek();
        }


        return answer;
    }
    public static void main(String[] args) {
        
    }
}
