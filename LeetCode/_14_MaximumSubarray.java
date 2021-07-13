package LeetCode;

public class _14_MaximumSubarray {
    public static int solution1(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, -1};
        System.out.println(solution1(nums));
    }
}
