package LeetCode;

import java.util.*;

public class _05_3Sum {
    public static List<List<Integer>> solution(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);

        int index = 0;

        while (index < nums.length && nums[index] <= 0) {
            int i = index + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[index] + nums[i] + nums[j] > 0) {
                    j--;
                } else if (nums[index] + nums[i] + nums[j] < 0) {
                    i++;
                } else {
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[index], nums[i], nums[j]));
                    answer.add(triplet);
                    j--;
                    i++;
                }
            }
            index++;
        }
        return new ArrayList<List<Integer>>(answer);
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0}));
    }
}
