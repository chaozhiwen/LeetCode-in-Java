import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return res(0,nums.length-1,nums);
    }
    
    public static TreeNode res(int start,int end,int[] nums){
        if(start>end) return null;
        
        int i=start;
        int j=end;
        
        int index=i;
        for(;i<=j;i++)
            if(nums[i]>nums[index])
                index=i;
        
        TreeNode node=new TreeNode(nums[index]);
        node.left=res(start,index-1,nums);
        node.right=res(index+1,end,nums);
        
        return node;
    }
	
	//所有路径
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        res(root,"",ans);
        return ans;
    }
    public static void res(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        s+=root.val+"";
        
        if(root.left==null&&root.right==null)
            ans.add(s);

        res(root.left,s+"->",ans);
        res(root.right,s+"->",ans);
        
    }

}
/*
 *  测试用例，输出树的所有路径
 */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] nums1={};
		int[] nums2={1,2,3,4,5,6,7,8,9,10};
		int[] nums3={10,9,8,7,6,5,4,3,2,1};
		int[] nums4={3,6,9,2,5,8,10,1,4,7};
		int[] nums5={2,3,9,5,7,10,1,8,6,4};
		int[] nums6={10};
		
		TreeNode r1=s.constructMaximumBinaryTree(nums1);
		TreeNode r2=s.constructMaximumBinaryTree(nums2);
		TreeNode r3=s.constructMaximumBinaryTree(nums3);
		TreeNode r4=s.constructMaximumBinaryTree(nums4);
		TreeNode r5=s.constructMaximumBinaryTree(nums5);
		TreeNode r6=s.constructMaximumBinaryTree(nums6);
		
		List<String> l1=s.binaryTreePaths(r1);
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i));
		System.out.println("**********");
		
		List<String> l2=s.binaryTreePaths(r2);
		for(int i=0;i<l2.size();i++)
			System.out.println(l2.get(i));
		System.out.println("**********");
		
		List<String> l3=s.binaryTreePaths(r3);
		for(int i=0;i<l3.size();i++)
			System.out.println(l3.get(i));
		System.out.println("**********");
		
		List<String> l4=s.binaryTreePaths(r4);
		for(int i=0;i<l4.size();i++)
			System.out.println(l4.get(i));
		System.out.println("**********");
		
		List<String> l5=s.binaryTreePaths(r5);
		for(int i=0;i<l5.size();i++)
			System.out.println(l5.get(i));
		System.out.println("**********");
		
		List<String> l6=s.binaryTreePaths(r6);
		for(int i=0;i<l6.size();i++)
			System.out.println(l6.get(i));
		System.out.println("**********");
		
	}
}
