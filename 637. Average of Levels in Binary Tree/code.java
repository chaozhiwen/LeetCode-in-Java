import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null) return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            int x=count;
            double sum=0.0;
            while(count>0){
                TreeNode tmp=q.poll();
                sum+=tmp.val;
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            res.add(sum/x);
        }
        return res;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*         100             */
		/*        /   \            */
		/*       50    20          */
		/*      / \   /  \          */
		/*     60  3 6   99         */
		TreeNode t1=new TreeNode(100);
		TreeNode t2=new TreeNode(50);
		TreeNode t3=new TreeNode(20);
		TreeNode t4=new TreeNode(60);
		TreeNode t5=new TreeNode(3);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(99);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		List<Double> print1=s.averageOfLevels(t1);
		for(int i=0;i<print1.size();i++)
			System.out.print(print1.get(i)+" ");
		System.out.println();
		
		
		/*      100              */
		/*      / \             */
		/*    50   20            */
		/*   /  \    \           */
		/*  60   3   99        */
		TreeNode g1=new TreeNode(100);
		TreeNode g2=new TreeNode(50);
		TreeNode g3=new TreeNode(20);
		TreeNode g4=new TreeNode(60);
		TreeNode g5=new TreeNode(3);
		TreeNode g6=new TreeNode(99);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		List<Double> print2=s.averageOfLevels(g1);
		for(int i=0;i<print2.size();i++)
			System.out.print(print2.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      / \             */
		/*     2   4            */
		/*    /     \           */
		/*   3       5          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(4);
		TreeNode q4=new TreeNode(3);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		List<Double> print3=s.averageOfLevels(q1);
		for(int i=0;i<print3.size();i++)
			System.out.print(print3.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		/*    /                 */
		/*   3                  */
		TreeNode w1=new TreeNode(1);
		TreeNode w2=new TreeNode(2);
		TreeNode w3=new TreeNode(3);
		w1.left=w2;
		w2.left=w3;
		List<Double> print4=s.averageOfLevels(w1);
		for(int i=0;i<print4.size();i++)
			System.out.print(print4.get(i)+" ");
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
		List<Double> print5=s.averageOfLevels(a1);
		for(int i=0;i<print5.size();i++)
			System.out.print(print5.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		List<Double> print6=s.averageOfLevels(b1);
		for(int i=0;i<print6.size();i++)
			System.out.print(print6.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		b1.left=b2;
		List<Double> print7=s.averageOfLevels(b1);
		for(int i=0;i<print7.size();i++)
			System.out.print(print7.get(i)+" ");
		System.out.println();
	}
}
