class Solution {
    public int findKthLargest(int[] nums, int k) {
        quick(nums);      
        return nums[nums.length-k];
    }
    
    public static void quick(int[] nums){
        quick(nums,0,nums.length-1);
    }
  
    public static void quick(int[] nums,int left,int right){
        if(left>=right) 
            return;
        
        int i=left,j=right;
        while(i!=j){
            while(i<j&&nums[j]>=nums[left])
                j--;
            while(i<j&&nums[i]<=nums[left])
                i++;
            if(i<j){
                int tmp=nums[j];
                nums[j]=nums[i];
                nums[i]=tmp;
            }
        }
            int tmp=nums[left];
            nums[left]=nums[i];
            nums[i]=tmp;
        
        
        quick(nums,left,i-1);
        quick(nums,i+1,right);
    }
}
class Main{
	public static void main(String[] args){
		class Solution=new Solution();
		int[] a={9,8,75,8,7,5,23,6,4};
		System.out.println(s.findKthLargest(a));
		
		int[] b={};
		Sort.quick(b);
		System.out.println(s.findKthLargest(b));
		
		int[] c={1,3,3,3,98,65,24,87,3,2};
		Sort.quick(c);
		System.out.println(s.findKthLargest(c));
		
		int[] d={5,5,5,5,5,5,5,5};
		Sort.quick(d);
		System.out.println(s.findKthLargest(d));
	}
}
