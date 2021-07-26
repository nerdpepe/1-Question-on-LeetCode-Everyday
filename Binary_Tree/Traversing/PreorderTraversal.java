import java.util.ArrayList;

public class PreorderTraversal {
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
    List<Integer> ans;

    public void traverse(TreeNode root) {
        if (root == null)
            return;
        ans.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        traverse(root);
        return ans;
    }
}
