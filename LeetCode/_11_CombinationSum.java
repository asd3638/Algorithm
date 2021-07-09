package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//더해서 target이 나오는 경우의 수
//원소는 여러번 사용 가능하다.

public class _11_CombinationSum {
    public static List<List<Integer>> solution(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);

        return answer;
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        System.out.println(solution(candidates, target));
    }
}
