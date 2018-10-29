class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                return i;
            }
        }
        return nums.length-1;
    }
}
