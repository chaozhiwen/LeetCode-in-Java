class Solution {
    public String reverseStr(String s, int k) {
        String ans="";
        char[] a=s.toCharArray();
        int i=0;
        while(i<a.length){
            if(a.length-i>k){
                int j=i;
                int l=i+k-1;//下标需-1
                while(j<l){
                    char temp=a[j];
                    a[j]=a[l];
                    a[l]=temp;
                    j++;
                    l--;
                }
                i+=2*k;
            }
            else{
                int j=i;
                int l=a.length-1;
                while(j<l){
                    char temp=a[j];
                    a[j]=a[l];
                    a[l]=temp;
                    j++;
                    l--;
                }
                break;
            }
        }
        return new String(a);
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String s1="chaozhiwen";
		System.out.println(s.reverseStr(s1,2));
		System.out.println(s.reverseStr(s1,4));
		System.out.println(s.reverseStr(s1,6));
		System.out.println(s.reverseStr(s1,8));
		System.out.println(s.reverseStr(s1,10));
	}
}
