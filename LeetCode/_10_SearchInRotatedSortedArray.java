package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _10_SearchInRotatedSortedArray {
    public static int solution1(int[] nums, int target) {
        //배열에 원소가 없는 경우 무조건 -1반환
        if(!IntStream.of(nums).anyMatch(i -> i == target)) {
            return -1;
        }
        //배열에 원소가 있는 경우
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        return list.indexOf(target);
    }
    public static int solution2(int[] nums, int target) {
        //탐색
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(solution1(nums, target));
    }
}
