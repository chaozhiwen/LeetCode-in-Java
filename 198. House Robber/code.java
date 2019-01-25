class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        
        nums[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
            nums[i]=Math.max(nums[i-1],nums[i-2]+nums[i]);
        return nums[n-1];
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.rob(new int[]{1,1,2,2}));
		System.out.println(s.rob(new int[]{1,2,1,2}));
		System.out.println(s.rob(new int[]{2,1,1,2}));
		System.out.println(s.rob(new int[]{2,1,2,1}));
		System.out.println(s.rob(new int[]{1,2,3,1}));
	}
}
