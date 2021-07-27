package LeetCode;

public class _19_UniquePaths {
    public static int uniquePaths(int m, int n) {
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        Long a = factorialOfTwo(min, max);
        Long b = factorialOfOne(min);
        int answer = (int) (a / b);
        return answer;
    }
    public static Long factorialOfTwo(int min, int max) {
        Long p = 1L;
        for (int i = max; i <= min + max - 2; i++) {
            p = p * i;
        }
        return p;
    }
    public static Long factorialOfOne(int min) {
        Long p = 1L;
        for (int i = 1; i <= min - 1; i++) {
            p = p * i;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(23, 12));
    }
}
