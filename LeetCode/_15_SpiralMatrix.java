package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _15_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int row = 0;
        int col = 0;
        int rowMax = rowSize - 1;
        int colMax = colSize - 1;

        while (answer.size() < rowSize * colSize) {
            for (int idx = col; idx <= colMax && answer.size() < rowSize * colSize; idx++) {
                answer.add(matrix[row][idx]);
            }
            for (int idx = row + 1; idx <= rowMax - 1 && answer.size() < rowSize * colSize; idx++) {
                answer.add(matrix[idx][colMax]);
            }
            for (int idx = colMax; idx >= col && answer.size() < rowSize * colSize; idx--) {
                answer.add(matrix[rowMax][idx]);
            }
            for (int idx = rowMax - 1; idx >= row + 1 && answer.size() < rowSize * colSize; idx--) {
                answer.add(matrix[idx][col]);
            }
            row++;
            col++;
            rowMax--;
            colMax--;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
        for (Integer i : spiralOrder(matrix)) {
            System.out.println(i);
        }
    }
}
