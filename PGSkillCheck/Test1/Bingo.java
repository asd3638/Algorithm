package PGSkillCheck.Test1;

import java.util.Arrays;

public class Bingo {
    public int solution(int[][] board, int[] nums) {
        int answer = 0;
        int[] row = new int[board[0].length];
        int[] col = new int[board.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (Arrays.stream(nums).toArray().equals(board[i][j])) {

                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
