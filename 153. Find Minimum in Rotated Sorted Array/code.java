class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
            if(ans>nums[i])
                return nums[i];
        return ans;
        
    }
}
/***simple example***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={4,5,6,7,8,9,1,2,3};
		int[] b={1,2,3,4,5,6,7,8,9,0};
		int[] c={5,6,9,50,1,2,3,4};
		System.out.println(s.findMin(a));
		System.out.println(s.findMin(b));
		System.out.println(s.findMin(c));
		
	}
}
