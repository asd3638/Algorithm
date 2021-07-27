package LeetCode;

public class _16_JumpGame {
    public static boolean canJump(int[] nums) {
        int endPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            endPoint = Math.max(i + nums[i], endPoint);
            if (endPoint == nums.length - 1) {
                return true;
            } else if (endPoint ==i) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(canJump(nums));
    }

}
