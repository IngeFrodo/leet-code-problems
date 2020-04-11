/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DiameterOfBinaryTree {
    
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        getLength(root);
        return maxDiameter;
    }
    
    private int getLength(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftLength = getLength(node.left);
        int rightLength = getLength(node.right);
        maxDiameter = Math.max(leftLength + rightLength + 2, maxDiameter);
        return Math.max(leftLength, rightLength) + 1;
    }
    
}
