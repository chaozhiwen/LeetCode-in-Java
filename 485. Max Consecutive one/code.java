class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                count++;
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return Math.max(ans,count);
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,0};
		int[] b={1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1};
		int[] c={1};
		int[] d={0};
		System.out.println(s.findMaxConsecutiveOnes(a));
		System.out.println(s.findMaxConsecutiveOnes(b));
		System.out.println(s.findMaxConsecutiveOnes(c));
		System.out.println(s.findMaxConsecutiveOnes(d));
	}
}
