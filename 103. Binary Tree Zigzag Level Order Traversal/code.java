import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean flag=true;
        
        while(!queue.isEmpty()){
            int count=queue.size();
            LinkedList<Integer> tmp=new LinkedList<>();
            while(count-->0){
                TreeNode cur=queue.poll();
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
                
                if(flag) tmp.add(cur.val);
                else tmp.push(cur.val);
            }
            res.add(tmp);
            flag=!flag;
        }
        return res;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*          1              */
		/*        /    \            */
		/*       2      3           */
		/*      / \    / \          */
		/*     4   5  6   7         */
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
		List<List<Integer>> a1=s.zigzagLevelOrder(t1);
		for(int i=0;i<a1.size();i++){
			for(int j=0;j<a1.get(i).size();j++)
				System.out.print(a1.get(i).get(j)+" ");
			System.out.println();
		}
		System.out.println("**********************");
		
		
		
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
		List<List<Integer>> a2=s.zigzagLevelOrder(g1);
		for(int i=0;i<a2.size();i++){
			for(int j=0;j<a2.get(i).size();j++)
				System.out.print(a2.get(i).get(j)+" ");
			System.out.println();
		}
		System.out.println("**********************");
		
		
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
		List<List<Integer>> a3=s.zigzagLevelOrder(q1);
		for(int i=0;i<a3.size();i++){
			for(int j=0;j<a3.get(i).size();j++)
				System.out.print(a3.get(i).get(j)+" ");
			System.out.println();
		}
		System.out.println("**********************");
		
		
		
		/*                100                       */
		/*              /     \                     */
		/*          50           120                */
		/*       /      \      /      \             */
		/*      45      60    110     130           */
		/*     /  \    / \   / \     /   \          */
		/*    40  46  55 65 105 120 130   140       */
		/*      \   \  \  \   \   \   \     \       */
		/*      42  48 57 81  110 125 135  145      */
		/*      /   /  /  /   /   /   /    /        */
		/*     41  47 56 80 109 124 132   142       */
		TreeNode c1=new TreeNode(100);
		TreeNode c2=new TreeNode(50);
		TreeNode c3=new TreeNode(120);
		TreeNode c4=new TreeNode(45);
		TreeNode c5=new TreeNode(60);
		TreeNode c6=new TreeNode(110);
		TreeNode c7=new TreeNode(130);
		c1.left=c2;
		c1.right=c3;
		c2.left=c4;
		c2.right=c5;
		c3.left=c6;
		c3.right=c7;	
		TreeNode c8=new TreeNode(40);
		TreeNode c9=new TreeNode(46);
		TreeNode c10=new TreeNode(55);
		TreeNode c11=new TreeNode(65);
		TreeNode c12=new TreeNode(105);
		TreeNode c13=new TreeNode(120);
		TreeNode c14=new TreeNode(130);
		TreeNode c15=new TreeNode(140);
		c4.left=c8;c4.right=c9;c5.left=c10;c5.right=c11;c6.left=c12;c6.right=c13;c7.left=c14;c7.right=c15;
		TreeNode c16=new TreeNode(42);
		TreeNode c17=new TreeNode(48);
		TreeNode c18=new TreeNode(57);
		TreeNode c19=new TreeNode(81);
		TreeNode c20=new TreeNode(110);
		TreeNode c21=new TreeNode(125);
		TreeNode c22=new TreeNode(135);
		TreeNode c23=new TreeNode(145);
		c8.right=c16;c9.right=c17;c10.right=c18;c11.right=c19;c12.right=c20;c13.right=c21;c14.right=c22;c15.right=c23;
		TreeNode f1=c1;
		TreeNode c24=new TreeNode(41);
		TreeNode c25=new TreeNode(47);
		TreeNode c26=new TreeNode(56);
		TreeNode c27=new TreeNode(80);
		TreeNode c28=new TreeNode(109);
		TreeNode c29=new TreeNode(124);
		TreeNode c30=new TreeNode(132);
		TreeNode c31=new TreeNode(142);
		c16.left=c24;c17.left=c25;c18.left=c26;c19.left=c27;c20.left=c28;c21.left=c29;c22.left=c30;c23.left=c31;
		List<List<Integer>> a4=s.zigzagLevelOrder(c1);
		for(int i=0;i<a4.size();i++){
			for(int j=0;j<a4.get(i).size();j++)
				System.out.print(a4.get(i).get(j)+" ");
			System.out.println();
		}
	}
}
