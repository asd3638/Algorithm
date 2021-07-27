package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _21_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        List<Integer> iList = new ArrayList<>();
        List<Integer> jList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    iList.add(i);
                    jList.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (iList.contains(i)) {
                int[] tmp = new int[matrix[0].length];
                for (int k = 0; k < matrix[0].length; k++) {
                    tmp[k] = 0;
                }
                matrix[i] = tmp;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                if (jList.contains(j)) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    }
}
