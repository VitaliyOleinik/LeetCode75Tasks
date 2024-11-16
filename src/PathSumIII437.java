public class PathSumIII437 {

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
        int counter = 0;
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) return 0;
            pathSumHelper(root, targetSum, 0);
            pathSum(root.left, targetSum);
            pathSum(root.right, targetSum);
            return counter;
        }

        void pathSumHelper(TreeNode root, int sum, long currentSum) {
            if (root == null) return;

            currentSum += root.val;
            if (currentSum == sum) {
                counter ++;
            }
            pathSumHelper(root.left, sum, currentSum);
            pathSumHelper(root.right, sum, currentSum);
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
        System.out.println(solution.pathSum(root1, 8));
    }
}
