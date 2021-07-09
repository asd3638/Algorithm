package LeetCode;

//rotation 으로 인한 인덱스 변화만 파악하면 될 듯
public class _12_RotateImage {
    public static void solution(int[][] matrix) {
        matrix[0][0] = 3;
        System.out.println(matrix[0][0]);
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        solution(matrix);
    }
}
