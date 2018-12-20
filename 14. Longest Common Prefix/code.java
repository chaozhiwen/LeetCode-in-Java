class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs[0].equals(""))
			return "";
		if(strs.length==1)
			return strs[0];
        String ans="";
       
        for(int i=0;i<strs[0].length();i++){
            boolean flag=true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                ans+=strs[0].charAt(i);
            else
                break;
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String[] a={"flow","flower","flew"};//fl
		String[] b={"","abc","abc"};//""
		String[] c={"abc","abc",""};//""
		String[] d={"abc","","abc"};//""
		String[] e={"picture","pic","pio"};//pi
		String[] f={"aaaa","aaaa","a"};//a
		String[] g=new String[0];//""
		System.out.println(s.longestCommonPrefix(a));
		System.out.println(s.longestCommonPrefix(b));
		System.out.println(s.longestCommonPrefix(c));
		System.out.println(s.longestCommonPrefix(d));
		System.out.println(s.longestCommonPrefix(e));
		System.out.println(s.longestCommonPrefix(f));
		System.out.println(s.longestCommonPrefix(g));
	}
}
