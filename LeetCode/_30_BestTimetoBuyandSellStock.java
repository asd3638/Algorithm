package LeetCode;

public class _30_BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int answer = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > answer) {
                max = prices[i];
                answer = prices[i] - min;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
