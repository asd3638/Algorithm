package SKILL.StackQueue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class price {
    public static int[] solution(int[] prices) {
        int time;
        int[] returns = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            time = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) {
                    time++;
                    break;
                }
                time++;
            }
            returns[i] = time;
        }
        return returns;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] prices = new int[]{1, 2, 3, 2, 3};
        int [] returns = solution(prices);
        for (int i = 0; i < returns.length; i++) {
            bw.write("" + returns[i]);
        }
        bw.flush();
        bw.close();
    }
}
