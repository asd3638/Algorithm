package SKILL.Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class diskController {
    public static class Disk {
        public int requestTime;
        public int processTime;
    
        public Disk(int requestTime, int processTime) {
            this.requestTime = requestTime;
            this.processTime = processTime;
        }
    
        @Override
        public String toString() {
            return "Disk{" +
                    "requestTime=" + requestTime +
                    ", processTime=" + processTime +
                    '}';
        }
    }
    public static int solution(int[][] jobs) {
        PriorityQueue<Disk> waitingQ = new PriorityQueue<>(new Comparator<Disk>(){
            @Override
            public int compare(Disk d1, Disk d2) {
                return d1.processTime - d2.processTime;
            }
        });
        LinkedList<Disk> disks = new LinkedList<>();

        for (int[] job : jobs) {
            disks.offer(new Disk(job[0], job[1]));
        }
        Collections.sort(disks, new Comparator<Disk>(){
            @Override
            public int compare(Disk d1, Disk d2) {
                return d1.requestTime - d2.requestTime;
            }
        });
        int answer = 0;
        int count = 0;
        int time = disks.peek().requestTime;
        int job = 0;

        while (count < jobs.length){
            while (!disks.isEmpty() && disks.peek().requestTime <= time) {
                waitingQ.offer(disks.pollFirst());
            }
            if (job == 0 && !waitingQ.isEmpty()) {
                answer += time - waitingQ.peek().requestTime + waitingQ.peek().processTime;
                job = waitingQ.poll().processTime;
                count++;
            }
            if (job > 0) {
                job--;
            }
            time++;
        }
        return answer / jobs.length;
    }
    public static void main(String[] args) {
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}};
        int answer = solution(jobs);
        System.out.println(answer + "");
    }
}
