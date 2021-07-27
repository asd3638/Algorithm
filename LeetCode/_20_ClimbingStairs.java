package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _20_ClimbingStairs {
    public static int climbStairs1(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }
    public static int climbStairs2(int n) {
        List<Integer> sumList = new ArrayList<>();
        sumList.add(1);
        sumList.add(2);
        for (int i = 2; i < n; i++) {
            sumList.add(sumList.get(i - 2) + sumList.get(i - 1));
        }
        return (int) sumList.get(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(7));
    }
}
