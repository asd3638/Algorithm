package Sorting;

import java.util.Arrays;

public class kNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] a = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(a);
            answer[i] = a[commands[i][2] - 1];
        }
        return answer;
    }
    public static void main(String[] args) {
        
    }
    
}
