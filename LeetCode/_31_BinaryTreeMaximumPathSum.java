package LeetCode;

public class _31_BinaryTreeMaximumPathSum {
    public static int answer = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int center = root.val;
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = Math.max(maxPathSum(root.left), left);
        }
        if (root.right != null) {
            right = Math.max(maxPathSum(root.right), right);
        }
        answer = Math.max(answer, center + left + right);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
