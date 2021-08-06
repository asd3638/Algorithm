package LeetCode;

public class _26_SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        if(p.val==q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else return false;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10, new TreeNode(5), new TreeNode(15));
        TreeNode node2 = new TreeNode(10, new TreeNode(5, null, new TreeNode(15)), null);
        isSameTree(node1, node2);
    }
}
