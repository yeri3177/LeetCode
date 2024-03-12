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

// BFS 방식 
class Solution { 
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i<size; i++){
                TreeNode node = queue.poll();

                if(i == size-1) ans.add(node.val); // 마지막 노드만 ans에 담기 
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return ans;
    }
}

/*
// DFS 방식 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        return list;
    }
    public void dfs(TreeNode root, List<Integer> list, int depth){
        if(root==null) return;
        if(list.size() == depth) list.add(root.val);
        dfs(root.right, list, depth+1);
        dfs(root.left, list, depth+1);
    }
}
*/