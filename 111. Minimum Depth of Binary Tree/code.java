import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        Queue<TreeNode> q=new LinkedList<>();
        int ans=1;
        TreeNode r=root;
        q.add(r);
            
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                if(tmp.left==null&&tmp.right==null)
                    return ans; 
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            ans++;
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*          1              */
		/*        /   \            */
		/*       2     3           */
		/*      / \   / \          */
		/*     4   5 6   7         */
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(7);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		System.out.println(s.minDepth(t1));
		
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    / \   \           */
		/*   4   5   6          */
		TreeNode g1=new TreeNode(1);
		TreeNode g2=new TreeNode(2);
		TreeNode g3=new TreeNode(3);
		TreeNode g4=new TreeNode(4);
		TreeNode g5=new TreeNode(5);
		TreeNode g6=new TreeNode(6);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		System.out.println(s.minDepth(g1));
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    /     \           */
		/*   4       5          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(3);
		TreeNode q4=new TreeNode(4);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		System.out.println(s.minDepth(q1));
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		/*    /                 */
		/*   3                  */
		TreeNode Z1=new TreeNode(1);
		TreeNode Z2=new TreeNode(2);
		TreeNode Z3=new TreeNode(3);
		Z1.left=Z2;
		Z2.left=Z3;
		System.out.println(s.minDepth(Z1));
		
		
		
		/*       1              */
		/*      / \              */
		/*     2   3             */
		/*    /                 */
		/*   4                  */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a2.left=a4;
		System.out.println(s.minDepth(a1));
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		System.out.println(s.minDepth(b1));
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		b1.left=b2;
		System.out.println(s.minDepth(b1));
	}
}
