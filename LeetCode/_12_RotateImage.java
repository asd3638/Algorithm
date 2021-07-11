package LeetCode;

//rotation 으로 인한 인덱스 변화만 파악하면 될 듯
//얕은 복사 vs 깊은 복사 이해해야 함.
public class _12_RotateImage {
    public static void solution1(int[][] matrix) {
        int[][] tempMatrix = new int[matrix.length][matrix.length];
        for (int i =0; i < matrix.length; i++) {
            int[] array = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                array[j] = matrix[Math.abs(j - (matrix.length - 1))][i];
            }
            tempMatrix[i] = array;
        }
        matrix = tempMatrix;
        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void solution2(int[][] matrix) {
        int m = matrix.length;
        int tmpJ = m - 1;
        for (int i = 0; i < (m % 2 == 0 ? m / 2 : (m / 2 + 1)); i++) {
            for(int j = 0; j < tmpJ; j++) {
                int temp = matrix[i][j + i];
                matrix[i][j + i] = matrix[m - 1 - j - i][i];
                matrix[m - 1 - j - i][i] = matrix[m - 1 - i][m - 1 - j - i];
                matrix[m - 1 - i][m - 1 - j - i] = matrix[j + i][m - 1 - i];
                matrix[j + i][m - 1 - i] = temp;
            }
            tmpJ -= 2;
        }
        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        solution2(matrix);
    }
}
