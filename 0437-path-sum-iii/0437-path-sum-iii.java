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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return getSum(root, targetSum, 0)+pathSum(root.left, targetSum)+pathSum(root.right, targetSum);
    }

    public int getSum(TreeNode root, int targetSum, long sum) {
        int cnt = 0;
        if (root == null) return cnt;
        
        sum += root.val;
        
        if (sum == targetSum) cnt++;
        
        cnt += getSum(root.left, targetSum, sum);
        cnt += getSum(root.right, targetSum, sum);
        
        sum -= root.val;
        
        return cnt;
    } 
}