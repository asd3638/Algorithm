package SKILL.StackQueue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class progress {
    public static int[] solution(int[] p, int[] s) {
        int count;
        List<Integer> day = new ArrayList<>();
        Queue<Integer> dayQueue = new LinkedList<>();
        for (int i = 0; i < p.length; i++) {
            if (((100 - p[i]) % s[i]) == 0) {
                dayQueue.offer(((100 - p[i]) / s[i]));
            } else {
                dayQueue.offer(((100 - p[i]) / s[i]) + 1);
            }
        }
        while(!dayQueue.isEmpty()) {
            count = 0;
            for (int i = 0; i < dayQueue.size(); i++) {
                if (dayQueue.peek() >= (int)dayQueue.toArray()[i]) {
                    count++;
                } else {
                    break;
                }
            }
            for (int i = 0; i < count; i++) {
                dayQueue.poll();
            }
            day.add(count);
        }
        int[] result = new int[day.size()];
        for (int i = 0; i < day.size(); i++) {
            result[i] = day.get(i);
        } 
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] p = new int[]{93, 30, 55};
        int[] s = new int[]{1, 30, 5};
        int[] result = solution(p, s);

        for (int i = 0; i < result.length; i++) {
            bw.write("" + result[i]);
        }
        bw.flush();
        bw.close();
    }
}
