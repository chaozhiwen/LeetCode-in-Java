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
class Main{
	public static void main(String[] args){
		int[] a={};
		int[] b={1};
		int[] c={1,2,1};
		int[] d={5,4,3,2,1,0};
		int[] e={0,1,2,3,4,5};
		int[] f={1,2,3,2,1,6,7,8,9};
		Solution s=new Solution();
		System.out.println("{}:"+s.findPeakElement(a));
		System.out.println("{1}:"+s.findPeakElement(b));
		System.out.println("{1,2,1}:"+s.findPeakElement(c));
		System.out.println("{5,4,3,2,1,0}:"+s.findPeakElement(d));
		System.out.println("{0,1,2,3,4,5}:"+s.findPeakElement(e));
		System.out.println("{1,2,3,2,1,6,7,8,9}:"+s.findPeakElement(f));
	}
}
