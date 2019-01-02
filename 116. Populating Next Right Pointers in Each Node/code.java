import java.util.*;

class TreeLinkNode {
	int val;
    TreeLinkNode left, right, next;
   TreeLinkNode(int x) { val = x; }
}

class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        
        Queue<TreeLinkNode> all=new LinkedList<>();
        all.add(root);
        
        while(!all.isEmpty()){
            int count=all.size();
            while(count>0){
                TreeLinkNode node=all.poll();
                if(count>1)
                    node.next=all.peek();
                if(node.left!=null)
                    all.add(node.left);
                if(node.right!=null)
                    all.add(node.right);
                 if(count==1)
                    node.next=new TreeLinkNode(-100);
                count--;
            }           
        }
	}
		
	public List<List<TreeLinkNode>> levelOrder(TreeLinkNode root) {
        if(root==null) return new ArrayList<>();
        
        List<List<TreeLinkNode>> ans=new ArrayList<>();
        Queue<TreeLinkNode> q=new LinkedList<>();
        TreeLinkNode r=root;
        
        q.add(r);
        while(!q.isEmpty()){
            List<TreeLinkNode> tmp=new ArrayList<>();
            int count=q.size();
            while(count>0){
                TreeLinkNode node=q.poll();
                tmp.add(node);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                count--;
            }
            ans.add(tmp);
        }
        return ans;
    }
	
}
   
  /*
  *  测试代码，采用二叉树的层次遍历，每次找到每一层最左边的结点，迭代next结点
  */ 
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*          1              */
		/*        /    \            */
		/*       2      3           */
		/*      / \    / \          */
		/*     4   5  6   7         */
		TreeLinkNode t1=new TreeLinkNode(1);
		TreeLinkNode t2=new TreeLinkNode(2);
		TreeLinkNode t3=new TreeLinkNode(3);
		TreeLinkNode t4=new TreeLinkNode(4);
		TreeLinkNode t5=new TreeLinkNode(5);
		TreeLinkNode t6=new TreeLinkNode(6);
		TreeLinkNode t7=new TreeLinkNode(7);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		s.connect(t1);
		List<List<TreeLinkNode>> res1=s.levelOrder(t1);
		for(int i=0;i<res1.size();i++){
			TreeLinkNode tmp=res1.get(i).get(0);
			while(tmp!=null){
				System.out.print(tmp.val+" ");
				tmp=tmp.next;
			}
			System.out.println();
		}	
		System.out.println("**********************");
		
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    / \   \           */
		/*   4   5   6          */
		TreeLinkNode g1=new TreeLinkNode(1);
		TreeLinkNode g2=new TreeLinkNode(2);
		TreeLinkNode g3=new TreeLinkNode(3);
		TreeLinkNode g4=new TreeLinkNode(4);
		TreeLinkNode g5=new TreeLinkNode(5);
		TreeLinkNode g6=new TreeLinkNode(6);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		s.connect(g1);
		List<List<TreeLinkNode>> res2=s.levelOrder(g1);
		for(int i=0;i<res2.size();i++){
			TreeLinkNode tmp=res2.get(i).get(0);
			while(tmp!=null){
				System.out.print(tmp.val+" ");
				tmp=tmp.next;
			}
			System.out.println();
		}
		System.out.println("**********************");
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    /     \           */
		/*   4       5          */
		TreeLinkNode q1=new TreeLinkNode(1);
		TreeLinkNode q2=new TreeLinkNode(2);
		TreeLinkNode q3=new TreeLinkNode(3);
		TreeLinkNode q4=new TreeLinkNode(4);
		TreeLinkNode q5=new TreeLinkNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		s.connect(q1);
		List<List<TreeLinkNode>> res3=s.levelOrder(q1);
		for(int i=0;i<res3.size();i++){
			TreeLinkNode tmp=res3.get(i).get(0);
			while(tmp!=null){
				System.out.print(tmp.val+" ");
				tmp=tmp.next;
			}
			System.out.println();
		}		
		System.out.println("**********************");
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    /     \           */
		/*   4       5          */
		/*          /           */
		/*         6            */
		TreeLinkNode u1=new TreeLinkNode(1);
		TreeLinkNode u2=new TreeLinkNode(2);
		TreeLinkNode u3=new TreeLinkNode(3);
		TreeLinkNode u4=new TreeLinkNode(4);
		TreeLinkNode u5=new TreeLinkNode(5);
		TreeLinkNode u6=new TreeLinkNode(6);
		u1.left=u2;
		u1.right=u3;
		u2.left=u4;
		u3.right=u5;
		u5.left=u6;
		s.connect(u1);
		List<List<TreeLinkNode>> res4=s.levelOrder(u1);
		for(int i=0;i<res4.size();i++){
			TreeLinkNode tmp=res4.get(i).get(0);
			while(tmp!=null){
				System.out.print(tmp.val+" ");
				tmp=tmp.next;
			}
			System.out.println();
		}
	}
}
