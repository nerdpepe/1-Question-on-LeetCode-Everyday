public class PostorderTraversal {
    List<Integer> l = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            l.add(root.val);
        }
        return l;
    }
}
