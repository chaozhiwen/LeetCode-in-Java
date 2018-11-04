/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> l=new LinkedList<>();
        l.add(root);
        l.add(root);
        while(!l.isEmpty()){
            TreeNode p=l.poll();
            TreeNode q=l.poll();
            if(p==null&&q==null) continue;
            if(p==null||q==null)  return false;
            if(p.val!=q.val) return false;
            l.add(p.left);
            l.add(q.right);
            l.add(p.right);
            l.add(q.left);
        }
        return true;
    }
}
