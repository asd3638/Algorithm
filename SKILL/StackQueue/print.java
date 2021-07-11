package SKILL.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class print {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> printQueue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            printQueue.offer(priorities[i]);
        }
        while (!printQueue.isEmpty()){
            boolean flag = false;
            for (int i = 1; i < printQueue.size(); i++) {
                if (printQueue.peek() < (int)printQueue.toArray()[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                printQueue.offer(printQueue.poll());
                location--;
                if(location < 0) {
                    location = printQueue.size() - 1;
                }
            } else {
                if (location == 0) {
                    answer++;
                    printQueue.clear();
                } else {
                    answer++;
                    printQueue.poll();
                    location--;
                    if(location < 0) {
                        location = printQueue.size() - 1;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;
        System.out.println("" + solution(priorities, location));
    }
    
}
