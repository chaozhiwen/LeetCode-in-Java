class Solution {
    public int countSegments(String s) {
        if(s.equals(""))
            return 0;
        s+=" ";
        Boolean temp=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isSpaceChar(s.charAt(i)))
                temp=true;
            else if(temp==true){
                count++;
                temp=false;
            }
        }
        return count;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution so=new Solution();
		String s1="          ";
		String s2="";
		String s3="chao zhi wen";
		String s4="I LOVE YOU";
		String s5="aa,aaa  bbbbb   ccc,ccc,  dd,ddd e ffffff..,,.,  ";
		System.out.println(so.countSegments(s1));
		System.out.println(so.countSegments(s2));
		System.out.println(so.countSegments(s3));
		System.out.println(so.countSegments(s4));
		System.out.println(so.countSegments(s5));
	}
}
