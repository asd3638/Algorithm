package LeetCode;

public class _23_WordSearch {
    public static boolean exist(char[][] board, String word) {

        char[] chars = word.toCharArray();

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) { // 첫번째 글자 찾기위한 2중 for문
                boolean[][] checkBoard = new boolean[board.length][board[0].length];
                if (board[y][x] == chars[0] && search(board, checkBoard, chars, x, y, 1) == word.length()) { // 첫글자를 찾고 search가 리턴한 크가가 word의 크기와 같으면 board에 글자 있다고 판단.
                    return true;
                }
            }
        }
        return false;
    }

    public static int search(char[][] board, boolean[][] checkBoard, char[] chars, int x, int y, int count) {

        // System.out.println("x = " + x + ", y = " + y + ", count = " + count);

        checkBoard[y][x] = true; // 한번접근한 곳 다시 접근하지 못하게
        int tempCount = count;

        if (tempCount != chars.length && x + 1 < board[0].length && board[y][x + 1] == chars[count] && !checkBoard[y][x + 1]) { // word의 길이와 탐색한 길이를 비교하여 다르고 board에 갈곳이 있는지 판단하여 재귀
            tempCount = search(board, checkBoard, chars, x + 1, y, count + 1);
        }

        if (tempCount != chars.length && y + 1 < board.length && board[y + 1][x] == chars[count] && !checkBoard[y + 1][x]) {
            tempCount = search(board, checkBoard, chars, x, y + 1, count + 1);
        }

        if (tempCount != chars.length && x > 0 && board[y][x - 1] == chars[count] && !checkBoard[y][x - 1]) {
            tempCount = search(board, checkBoard, chars, x - 1, y, count + 1);
        }

        if (tempCount != chars.length && y > 0 && board[y - 1][x] == chars[count] && !checkBoard[y - 1][x]) {
            tempCount = search(board, checkBoard, chars, x, y - 1, count + 1);
        }

        checkBoard[y][x] = false; // 더이상 돌곳이 없으면 다시 풀어주는 역할

        return tempCount;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }
}
