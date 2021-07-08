package LeetCode;

public class _04_ContainerWithMostWater {
    public static int solution1(int[] height) {
        int answer = 0;
        for (int i = 1; i < height.length; i++) {
            int j = 0;
            while(true) {
                if(j + i >= height.length) {
                    break;
                }
                int tempArea = i * (Math.min(height[j], height[j + i]));
                if (tempArea > answer) {
                    answer = tempArea;
                }
                j++;
            }
        }
        return answer;
    }
    public static int solution2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int answer = 0;
        while (left < right) {
            answer = Math.max(answer, (right - left) * Math.min(height[left], height[right]));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution1(height));
        System.out.println(solution2(height));
    }
}
