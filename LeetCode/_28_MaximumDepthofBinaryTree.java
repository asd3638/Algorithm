package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class _28_MaximumDepthofBinaryTree {
    public static int maxDepthWithQueue(TreeNode root) {
        int answer = 0;
        if (root == null) {
            return answer;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            for (int i = 0; i< size; i++) {
                TreeNode treeNode = treeNodeQueue.poll();
                if (treeNode.left != null) {
                    treeNodeQueue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNodeQueue.add(treeNode.right);
                }
            }
            answer++;
        }
        return answer;
    }
    public static int maxDepthWithStack() {
        return 0;
    }
    public static int maxDepthWithRecur(TreeNode root) {
        return goDepth(root, 0);
    }
    public static int goDepth(TreeNode node, int depth) {
        if (node == null) return depth;

        return Math.max(goDepth(node.left, depth + 1), goDepth(node.right, depth + 1));
    }
    public static void main(String[] args) {
        System.out.println(maxDepthWithRecur(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}
