class Solution {
    public int thirdMax(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
            first=Math.max(first,nums[i]);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==first) continue;
            second=Math.max(second,nums[i]);
        }
        
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==first||nums[i]==second)
                continue;
            third=Math.max(third,nums[i]);
            flag=true;
        }
        
        if(flag) return third;
        return first;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		
		int[] a={1};
		int[] b={1,2};
		int[] c={1,2,3};
		int[] d={5,4,3,2,1};
		int[] e={Integer.MIN_VALUE,6,Integer.MIN_VALUE};
		int[] f={Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE,5};
		int[] g={1,1,2};
		int[] h={11,22,33,11,22,33};
		int[] i={33,33,33,33,33};
		
		
		System.out.println(s.thirdMax(a));
		System.out.println(s.thirdMax(b));
		System.out.println(s.thirdMax(c));
		System.out.println(s.thirdMax(d));
		System.out.println(s.thirdMax(e));
		System.out.println(s.thirdMax(f));
		System.out.println(s.thirdMax(g));
		System.out.println(s.thirdMax(h));
		System.out.println(s.thirdMax(i));
	}
}
