class Solution {
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            for(int i=1;i<digits.length;i++){
                ans[i]=digits[i];
            }
            return ans;
        }
        return digits;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1,2,3,9};
		a=s.plusOne(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
		int[] b={9,9,9};
		b=s.plusOne(b);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
		System.out.println();
		int[] c={0};
		c=s.plusOne(c);
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
		System.out.println();
		int[] d={9};
		d=s.plusOne(d);
		for(int i=0;i<d.length;i++)
			System.out.print(d[i]);
	}
}
