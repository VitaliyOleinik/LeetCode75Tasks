import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            getRightSide(root, list, 0);
            return list;
        }

        private void getRightSide(TreeNode node, ArrayList<Integer> list, int depth) {
            if (node == null) return;
            if (list.size() == depth) {
                list.add(node.val);
            }
            getRightSide(node.right, list, depth + 1);
            getRightSide(node.left, list, depth + 1);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        System.out.println(solution.rightSideView(root1));
    }
}
