public class DeleteNodeBST450 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) return null;
            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else {
                // found key node
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                TreeNode minNode = findMinNode(root.right);

                root.val = minNode.val;

                root.right = deleteNode(root.right, minNode.val);
            }
            return root;
        }

        private TreeNode findMinNode(TreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        root.right.right = new TreeNode(10);
        System.out.println(solution.deleteNode(root, 2).val);
    }   
}
