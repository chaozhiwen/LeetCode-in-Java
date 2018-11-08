class Solution {
    public String reverseWords(String s) {
        char[] ans=s.toCharArray();
        int p=0;
        for(int i=0;i<s.length();i++){
            if(Character.isSpaceChar(ans[i])){
                int q=i-1;
                while(p<=q){
                    swap(ans,p,q);
                    p++;
                    q--;
                }
                p=i+1;
            }
        }
        int q=ans.length-1;
        while(p<=q){
            swap(ans,p,q);
                p++;
                q--;
        }
        return String.valueOf(ans);
    }
    public static void swap(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
