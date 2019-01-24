class Solution {
    public int maxSubArray(int[] nums) {        
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0)
                nums[i]+=nums[i-1];
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(s.maxSubArray(new int[]{1,-1,2,-2,3,-3}));
		System.out.println(s.maxSubArray(new int[]{1,-1,-2,-3,-4,-5,-6,-7,99}));
		System.out.println(s.maxSubArray(new int[]{1,2,3,4}));
	}
}
