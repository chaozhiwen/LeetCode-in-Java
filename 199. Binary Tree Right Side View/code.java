import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode r=root;
        q.add(r);
        
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                if(count==1)
                    ans.add(tmp.val);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
                    
            }
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
		List<Integer> l1=s.rightSideView(t1);
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+" ");
		System.out.println();
		
		
		
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
		List<Integer> l2=s.rightSideView(g1);
		for(int i=0;i<l2.size();i++)
			System.out.print(l2.get(i)+" ");
		System.out.println();
		
		
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
		List<Integer> l3=s.rightSideView(q1);
		for(int i=0;i<l3.size();i++)
			System.out.print(l3.get(i)+" ");
		System.out.println();
		
		
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
		List<Integer> l4=s.rightSideView(t1);
		for(int i=0;i<l4.size();i++)
			System.out.print(l4.get(i)+" ");
		System.out.println();
		
		
		
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
		List<Integer> l5=s.rightSideView(a1);
		for(int i=0;i<l5.size();i++)
			System.out.print(l5.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		List<Integer> l6=s.rightSideView(b1);
		for(int i=0;i<l6.size();i++)
			System.out.print(l6.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		b1.left=b2;
		List<Integer> l7=s.rightSideView(b1);
		for(int i=0;i<l7.size();i++)
			System.out.print(l7.get(i)+" ");
		System.out.println();
	}
}
