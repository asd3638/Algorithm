package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _23_WordSearch {
    public static boolean exist1(char[][] board, String word) {
        List<Character> boardList = new ArrayList<>();
        for (char[] chars : board) {
            for (char c : chars) {
                boardList.add(c);
            }
        }
        for (char c : word.toCharArray()) {
            if (boardList.contains(c)) {
                boardList.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean exist2(char[][] board, String word) {
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'a','b'}, {'c','d'}};
        String word = "abcd";
        System.out.println(exist2(board, word));
    }
}
