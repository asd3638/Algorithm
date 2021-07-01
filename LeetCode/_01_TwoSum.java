package LeetCode;

public class _01_TwoSum {
    public static int[] solution(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    answer = new int[]{i, j};
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i : solution(new int[]{2,7,11,15}, 9)) {
            System.out.println(i);
        }
    }
}
