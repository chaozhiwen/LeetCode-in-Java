import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<n.length;i++)
            n[i]=nums[i];
        Arrays.sort(nums);
        String[] ans=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<n.length;j++)
                if(nums[i]==n[j]){
                    if(i==nums.length-1)
                        ans[j]="Gold Medal";
                    else if(i==nums.length-2)
                        ans[j]="Silver Medal";
                    else if(i==nums.length-3)
                        ans[j]="Bronze Medal";
                    else
                        ans[j]=nums.length-i+"";
                }
        return ans;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution so=new Solution();
		int[] a={11,22,33,44,88,66,55,99,77};
		String[] s=so.findRelativeRanks(a);
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+"  ");
		System.out.println();
		
		int[] b={1,2};
		String[] s2=so.findRelativeRanks(b);
		for(int i=0;i<s2.length;i++)
			System.out.print(s2[i]+"  ");
		System.out.println();
		
		int[] c={1};
		String[] s3=so.findRelativeRanks(c);
		for(int i=0;i<s3.length;i++)
			System.out.print(s3[i]+"  ");
		System.out.println();
	}
}
