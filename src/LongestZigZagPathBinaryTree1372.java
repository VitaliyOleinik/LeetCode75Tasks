public class LongestZigZagPathBinaryTree1372 {
    static class TreeNode {
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

    static class Solution {
        int maxZigZag = 0;
        public int longestZigZag(TreeNode root) {
            if (root == null) return 0;
            traverse(root.left, true, 1);
            traverse(root.right, false, 1);
            return maxZigZag;
        }

        private void traverse(TreeNode node, boolean isLeft, int length) {
            if (node == null) return;

            maxZigZag = Math.max(maxZigZag, length);

            if (isLeft) {
                traverse(node.right, false, length + 1);
                traverse(node.left, true, 1);
            } else {
                traverse(node.left, true, length + 1);
                traverse(node.right, false, 1);
            }
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            TreeNode root1 = new TreeNode(3);
            root1.left = new TreeNode(5);
            root1.right = new TreeNode(1);
            root1.left.left = new TreeNode(6);
            root1.left.right = new TreeNode(2);
            root1.right.left = new TreeNode(9);
            root1.right.right = new TreeNode(8);
            root1.left.right.left = new TreeNode(7);
            root1.left.right.right = new TreeNode(4);
            System.out.println(solution.longestZigZag(root1));
        }
    }
}
