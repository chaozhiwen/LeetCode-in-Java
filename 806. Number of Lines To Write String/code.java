class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        char[] word={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int row=1;
        int len=0;
        int[] ans=new int[2];
        for(int i=0;i<S.length();i++){
            for(int j=0;j<word.length;j++){
                if(S.charAt(i)==word[j]){
                    if(len+widths[j]>100){
                        row++;
                        len=widths[j];
                        break;
                    }else{
                        len+=widths[j];
                        break;
                    }
                }
            }
        }
        ans[0]=row;
        ans[1]=len;
        return ans;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] s1={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		int[] s2=new int[26];
		for(int i=0;i<s2.length;i++)
			s2[i]=i*2;
		int[] s3=new int[26];
		for(int i=0;i<s3.length;i++)
			s3[i]=i;
		String st1="abcdefghijklmnopqrstuvwxyz";
		String st2="a";
		String st3="zzzzzzzzzzz";
		String st4="";
		for(int i=0;i<100;i++)
			st4+="a";
		int[] a1=s.numberOfLines(s1,st1);
		int[] a2=s.numberOfLines(s2,st2);
		int[] a3=s.numberOfLines(s3,st3);
		int[] a4=s.numberOfLines(s3,st4);
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		for(int i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		System.out.println();
		for(int i=0;i<a3.length;i++)
			System.out.print(a3[i]+" ");
		System.out.println();
		for(int i=0;i<a4.length;i++)
			System.out.print(a4[i]+" ");
		System.out.println();
		
	}
}
