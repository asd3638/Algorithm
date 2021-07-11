package SKILL.StackQueue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

class Truck {
    int enterTime;
    int weight;

    Truck(int enterTime, int weight) {
        this.enterTime = enterTime;
        this.weight = weight;
    }
}
public class bridge {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int totalWeightOnBridge = 0;

        Queue<Truck> waiting_truck = new LinkedList<Truck>();
        Queue<Truck> crossing_truck = new LinkedList<Truck>();

        for (int i = 0; i < truck_weights.length; i++) {
            waiting_truck.offer(new Truck(0, truck_weights[i]));
        }

        while (!(waiting_truck.isEmpty() && crossing_truck.isEmpty())) {
            time++;
            // 다리를 건너는 트럭
            if (!crossing_truck.isEmpty()) {
                if ((time - crossing_truck.peek().enterTime) >= bridge_length) {
                    totalWeightOnBridge -= crossing_truck.peek().weight;
                    crossing_truck.poll();
                }
            }
            // 대기에 있는 트럭
            if (!waiting_truck.isEmpty()) {
                if ((totalWeightOnBridge + waiting_truck.peek().weight) <= weight) {
                    totalWeightOnBridge += waiting_truck.peek().weight;
                    crossing_truck.offer(new Truck(time, waiting_truck.peek().weight));
                    waiting_truck.poll();
                }
            }
        }
        return time;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = new int[]{7, 4, 5, 6};
        int result;

        result = solution(bridge_length, weight, truck_weights);

        bw.write("" + result);
        bw.flush();
        bw.close();
    }
}
