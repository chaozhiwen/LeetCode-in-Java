import java.util.*;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
class Solution {
	public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode ro=root;
        q.add(ro);
        
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                TreeNode node=q.poll();
                TreeNode l=node.left;
                TreeNode r=node.right;
                node.left=r;
                node.right=l;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                count--;
            }
        }
        
        return root;
        /*递归
        if (!(root.right == null && root.left == null)) {
            TreeNode right = root.right;
            TreeNode left = root.left;
            root.right = left;
            root.left = right;
            
            if (root.right != null) {
                invertTree(root.right);
            }
            
            if (root.left != null) {
                invertTree(root.left);
            }
        }
        
        return root;*/
    }
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null) return new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<>();
		TreeNode r=root;
		q.add(r);
		while(!q.isEmpty()){
			List<Integer> tmp=new ArrayList<>();
			int count=q.size();
			while(count>0){
				TreeNode node=q.poll();
				tmp.add(node.val);
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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
			/*  		 1     */
			/* 		/ \    */
			/* 	  2   3   */
			/* 	 / \ / \  */
			/* 	4  5 6  7 */
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
		List<List<Integer>> a1=s.levelOrder(t1);
		System.out.println("翻转前：");
		for(int i=0;i<a1.size();i++){
			for(int j=0;j<a1.get(i).size();j++)
				System.out.print(a1.get(i).get(j)+" ");
			System.out.println();
		}
		List<List<Integer>> b1=s.levelOrder(s.invertTree(t1));
		System.out.println("翻转后：");
		for(int i=0;i<b1.size();i++){
			for(int j=0;j<b1.get(i).size();j++)
				System.out.print(b1.get(i).get(j)+" ");
			System.out.println();
		}
		System.out.println("**********************");
		
		
					/*  		1 				 */
					/* 	  / \          */
					/*     2  3         */
					/*    / \  \        */
					/*   4   5  6       */
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
		List<List<Integer>> a2=s.levelOrder(g1);
		System.out.println("翻转前：");
		for(int i=0;i<a2.size();i++){
			for(int j=0;j<a2.get(i).size();j++)
				System.out.print(a2.get(i).get(j)+" ");
			System.out.println();
		}
		List<List<Integer>> b2=s.levelOrder(s.invertTree(g1));
		System.out.println("翻转后：");
		for(int i=0;i<b2.size();i++){
			for(int j=0;j<b2.get(i).size();j++)
				System.out.print(b2.get(i).get(j)+" ");
			System.out.println();
		}
		System.out.println("**********************");
		
		
		
		
		/* 	 1 		*/
		/*   / \ 		*/
		/*   2  3 		*/
		/*  /    \ 	*/
		/* 4      5 	*/
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(3);
		TreeNode q4=new TreeNode(4);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		List<List<Integer>> a3=s.levelOrder(q1);
		System.out.println("翻转前：");
		for(int i=0;i<a3.size();i++){
			for(int j=0;j<a3.get(i).size();j++)
				System.out.print(a3.get(i).get(j)+" ");
			System.out.println();
		}
		List<List<Integer>> b3=s.levelOrder(s.invertTree(q1));
		System.out.println("翻转后：");
		for(int i=0;i<b3.size();i++){
			for(int j=0;j<b3.get(i).size();j++)
				System.out.print(b3.get(i).get(j)+" ");
			System.out.println();
		}
	}
}
