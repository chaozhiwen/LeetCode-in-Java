class Solution {
    public int majorityElement(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums[nums.length/2];
    }
    private void sort(int[] nums,int lo,int hi){
        if(lo>=hi) return;
        int i=lo,j=hi;
        while(i<j){
            while(i<j&&nums[j]>=nums[lo])
                j--;
            while(i<j&&nums[i]<=nums[lo])
                i++;
            if(i<j)
                swap(nums,i,j);
        }
        swap(nums,lo,i);
        sort(nums,lo,i-1);
        sort(nums,i+1,hi);
    }
    
    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.majorityElement(new int[]{1,2,3,1,2,1,2,1,2,1,1,1,1,1,1}));
		System.out.println(s.majorityElement(new int[]{5,5,5,5,5,5,5,5,5,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
		System.out.println(s.majorityElement(new int[]{1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,1}));
		System.out.println(s.majorityElement(new int[]{1,2,1}));
	}
}
