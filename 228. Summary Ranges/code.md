import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            String tmp=nums[i]+"";
            int j=i;
            for(;i<nums.length-1;i++){
                if(nums[i]+1!=nums[i+1])
                    break;   
            }
            if(i!=j)
                tmp+=("->"+nums[i]);
            ans.add(tmp);
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		int[] a={};
		int[] b={0};
		int[] c={1,2};
		int[] d={1,2,4};
		int[] e={1,2,3,7,8,9};
		int[] f={1,3,4,6,7,8,10,11,12,13,15,17,18,19};
		
		List<String> s1=s.summaryRanges(a);
		List<String> s2=s.summaryRanges(b);
		List<String> s3=s.summaryRanges(c);
		List<String> s4=s.summaryRanges(d);
		List<String> s5=s.summaryRanges(e);
		List<String> s6=s.summaryRanges(f);
		
		for(int i=0;i<s1.size();i++)
			System.out.print(s1.get(i)+" ");
		System.out.println();
		
		
		for(int i=0;i<s2.size();i++)
			System.out.print(s2.get(i)+" ");
		System.out.println();
		
		
		for(int i=0;i<s3.size();i++)
			System.out.print(s3.get(i)+" ");
		System.out.println();
		
		
		for(int i=0;i<s4.size();i++)
			System.out.print(s4.get(i)+" ");
		System.out.println();
		
		
		for(int i=0;i<s5.size();i++)
			System.out.print(s5.get(i)+" ");
		System.out.println();
		
		
		for(int i=0;i<s6.size();i++)
			System.out.print(s6.get(i)+" ");
		System.out.println();
	}
}
