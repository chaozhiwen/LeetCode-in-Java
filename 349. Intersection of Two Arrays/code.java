import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h1=new HashSet<>();
        Set<Integer> h2=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
            h1.add(nums1[i]);
        
        for(int i=0;i<nums2.length;i++)
            if(h1.contains(nums2[i]))
                h2.add(nums2[i]);
        
        int[] ans=new int[h2.size()];
        Iterator it=h2.iterator();
        int i=0;
        while(it.hasNext())
            ans[i++]=(int)it.next();
        
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		int[] a1={};
		int[] a2={};
		int[] a=s.intersection(a1,a2);
		System.out.print("-");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		
		int[] b1={};
		int[] b2={1,2,3};
		int[] b=s.intersection(b1,b2);
		System.out.print("-");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		
		int[] c1={9,8,7,6,5,4,3,2,1};
		int[] c2={9,8,7,6,5,4,3,2,1};
		int[] c=s.intersection(c1,c2);
		System.out.print("-");
		for(int i:c)
			System.out.print(i+" ");
		System.out.println();
		
		int[] d1={10,11,12,13,14};
		int[] d2={15,16,17,18,19};
		int[] d=s.intersection(d1,d2);
		System.out.print("-");
		for(int i:d)
			System.out.print(i+" ");
		System.out.println();
		
		int[] e1={111,222,333,444,555};
		int[] e2={444,555,666,777};
		int[] e=s.intersection(e1,e2);
		System.out.print("-");
		for(int i:e)
			System.out.print(i+" ");
		System.out.println();
		
		int[] f1={111,222,333,444,555};
		int[] f2={111,111,111,111,111};
		int[] f=s.intersection(f1,f2);
		System.out.print("-");
		for(int i:f)
			System.out.print(i+" ");
		System.out.println();
		
		int[] g1={111,222,333,444,555};
		int[] g2={111,555};
		int[] g=s.intersection(g1,g2);
		System.out.print("-");
		for(int i:g)
			System.out.print(i+" ");
		System.out.println();
		
		int[] h1={0,0,0,0,0,0,0,0};
		int[] h2={0,0,0,0,0,0,0,0};
		int[] h=s.intersection(h1,h2);
		System.out.print("-");
		for(int i:h)
			System.out.print(i+" ");
		System.out.println();

	}
}
