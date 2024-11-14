import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> list1 = new ArrayList();
            list1 = getAllLastNumbers(root1, list1);
            ArrayList<Integer> list2 = new ArrayList();
            list2 = getAllLastNumbers(root2, list2);
            return list1.equals(list2);
        }

        public ArrayList<Integer> getAllLastNumbers(TreeNode root, ArrayList<Integer> list) {
            if (root == null) return list;
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }

            list = getAllLastNumbers(root.left, list);
            list = getAllLastNumbers(root.right, list);

            return list;
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

        // Дерево root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        System.out.println(solution.leafSimilar(root1, root2));
    }
}
