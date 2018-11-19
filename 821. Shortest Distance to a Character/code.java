import java.util.*;
class Solution {
    public int[] shortestToChar(String S, char C) {
        /*** 暴力法 ***/
        /*Vector<Integer> v=new Vector<>();
        int[] ans=new int[S.length()];
        for(int i=0;i<S.length();i++)
            if(S.charAt(i)==C)
                v.add(i);
        for(int i=0;i<S.length();i++){
            int temp=Integer.MAX_VALUE;
            for(int j=0;j<v.size();j++)
                temp=Math.min(temp,Math.abs(v.get(j)-i));
            ans[i]=temp;
        }
        return ans;*/
        
        /*** 双指针 ***/
        int[] ans=new int[S.length()];
        for(int i=0;i<S.length();i++){
            int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--)
                if(S.charAt(j)==C){
                    left=i-j;
                    break;
                }
            for(int k=i;k<S.length();k++)
                if(S.charAt(k)==C){
                    right=k-i;
                    break;
                }
            ans[i]=Math.min(left,right);
        }
        return ans;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String s1="I LOVE YOU";
		int[] a=s.shortestToChar(s1,'O');
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		a=s.shortestToChar(s1,'I');
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		a=s.shortestToChar(s1,'U');
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
