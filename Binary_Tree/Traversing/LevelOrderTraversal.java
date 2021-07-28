public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> trav = new ArrayList<>();

        if (root == null)
            return trav;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> list = new ArrayList<>();
            while (len-- > 0) {
                TreeNode node = que.poll();

                if (node.left != null)
                    que.add(node.left);

                if (node.right != null)
                    que.add(node.right);

                list.add(node.val);
            }
            trav.add(list);
        }

        return trav;
    }
}
