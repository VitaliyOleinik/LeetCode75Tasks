public class CountGoodNodesBinaryTree1448 {

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
        public int goodNodes(TreeNode root) {
            return findAllNodesAndCompare(root, root.val);
        }

        public int findAllNodesAndCompare(TreeNode root, int maxSoFar) {
            if (root == null) {
                return 0;
            }
            int cnt = 0;
            if (root.val >= maxSoFar) {
                cnt = 1;
                maxSoFar = root.val;
            }
            cnt += findAllNodesAndCompare(root.left, maxSoFar);
            cnt += findAllNodesAndCompare(root.right, maxSoFar);
            return cnt;
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
        System.out.println(solution.goodNodes(root1));
    }
}
