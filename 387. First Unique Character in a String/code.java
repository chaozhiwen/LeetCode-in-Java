class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            int j=0;
            for(;j<s.length();j++){
                if(i==j)
                    continue;
                if(s.charAt(i)==s.charAt(j))
                    break;
            }
            if(j==s.length())
                return i;
        }
        return -1;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution so=new Solution();
		String s1="abc";
		String s2="abcdsa";
		String s3="chaozhiwen";
		String s4="iloveyou";
		String s5="aa";
		String s6="aabbcdd";
		String s7="abcabcd";
		String s8="acbdabceflo";
		System.out.println(so.firstUniqChar(s1));
		System.out.println(so.firstUniqChar(s2));
		System.out.println(so.firstUniqChar(s3));
		System.out.println(so.firstUniqChar(s4));
		System.out.println(so.firstUniqChar(s5));
		System.out.println(so.firstUniqChar(s6));
		System.out.println(so.firstUniqChar(s7));
		System.out.println(so.firstUniqChar(s8));
	}
}
