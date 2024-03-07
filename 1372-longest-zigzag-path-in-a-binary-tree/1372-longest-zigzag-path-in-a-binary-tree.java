/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        maxZigZag(root.left, false, 0);
        maxZigZag(root.right, true, 0);
        return max;
    }
    
    public void maxZigZag(TreeNode node, boolean direction, int cnt){
        if (node == null) return;
        max = Math.max(max, ++cnt);
        
        if(!direction) { // left
            maxZigZag(node.right, true, cnt);
            maxZigZag(node.left, false, 0);
        }
        else { // right
            maxZigZag(node.left, false, cnt);
            maxZigZag(node.right, true, 0);
        }
    }
}