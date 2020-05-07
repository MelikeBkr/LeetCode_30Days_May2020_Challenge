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

   TreeNode xParent = null, yParent = null;

    int heightX = 0, heightY = 1;

    public boolean isCousins(TreeNode root, int x, int y) 
    {
        dfs(root, null, x, y, 0);
        return heightX == heightY && xParent != yParent;
    }
    void dfs(TreeNode root, TreeNode parent, int x, int y, int level) 
    {
        if (root == null)
        {
            return;
        } 
        if (x == root.val) 
        {
            xParent = parent;
            heightX = level;
        } 
         if (y == root.val) 
        {
            yParent = parent;
            heightY = level;
        } 

            dfs(root.left, root, x, y, level + 1);
            dfs(root.right, root, x, y, level + 1);

    }
}