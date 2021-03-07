package Heap;
//먼저 힙 구조부터 만들어보자
import java.lang.reflect.Array;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import javax.swing.Popup;

public class scovile {
    public static int solution(int[] scovile, int k) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scovile) {
            pq.add(i);
        }
    
        while(true) {
            if (pq.peek() >= k) {
                break;
            }
            if (pq.size() == 1) {
                return -1;
            }
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] scovile = new int[]{3, 3, 50, 1, 1, 1, 2};
        int k = 20;
        int result = solution(scovile, k);
        System.out.println(result);
    }
    
}
