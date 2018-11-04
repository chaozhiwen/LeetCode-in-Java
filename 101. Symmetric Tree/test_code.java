import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		TreeNode r=new TreeNode(1);
		TreeNode r1=new TreeNode(2);
		TreeNode r2=new TreeNode(3);
		r.left=r1;
		r.right=r2;
		System.out.println("1,2,3-->"+s.isSymmetric(r));
		TreeNode t=new TreeNode(1);
		TreeNode t1=new TreeNode(2);
		TreeNode t2=new TreeNode(2);
		t.left=t1;
		t.right=t2;
		System.out.println("1,2,2-->"+s.isSymmetric(t));
		TreeNode k=new TreeNode(1);
		TreeNode k1=new TreeNode(2);
		TreeNode k2=null;
		k.left=k1;
		k.right=k2;
		System.out.println("1,2,null-->"+s.isSymmetric(k));
	}
}
