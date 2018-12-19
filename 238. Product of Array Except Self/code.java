class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length]; 
        
        left[0]=1;
        right[right.length-1]=1;
        
        //先从左向右遍历，记录当前元素左边的乘积
        for(int i=1;i<nums.length;i++)
            left[i]=nums[i-1]*left[i-1];
        
        //再从右向左遍历，记录当前元素右边的乘积
        for(int j=right.length-2;j>=0;j--)
            right[j]=nums[j+1]*right[j+1];
        
        for(int i=0;i<nums.length;i++)
            ans[i]=left[i]*right[i];
        
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1,2,3,4};
		int[] b={1,2};
		int[] c={1};
		int[] d={1,2,3,4,5,6,7,0};
		int[] e={8,7,5,5,6,3,5,7,4,1,8};
		
		a=s.productExceptSelf(a);
		b=s.productExceptSelf(b);
		c=s.productExceptSelf(c);
		d=s.productExceptSelf(d);
		e=s.productExceptSelf(e);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		System.out.println();
		for(int i=0;i<d.length;i++)
			System.out.print(d[i]+" ");
		System.out.println();
		for(int i=0;i<e.length;i++)
			System.out.print(e[i]+" ");
		System.out.println();
	}
}
