package SKILL.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class hIndex {
    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = new Integer[citations.length];
        for (int i = 0; i < citations.length; i++) {
            arr[i] = citations[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (i + 1)) {
                answer = arr[i];
                break;
            } else if (arr[i] < (i + 1)) {
                answer = i;
                break;
            } else {
                answer = arr.length;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] citations = new int[]{10, 11, 12, 13};
        System.out.println(solution(citations) + "");
    }
    
}
