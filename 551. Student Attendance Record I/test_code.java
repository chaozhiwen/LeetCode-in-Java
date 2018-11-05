class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                countA++;
            }else if(s.charAt(i)=='L'){
                int k=1;
                String temp="";
                for(int j=i;j<s.length()&&k<4;j++){
                    temp+=s.charAt(j);
                    k++;
                }
                if(temp.equals("LLL"))
                    return false;
            }
        }
        return countA<=1;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String s1="PPAAL";
		String s2="PPALPLPL";
		String s3="PALAPAL";
		String s4="PPALLPLLPLLPLL";
		System.out.println(s1+":"+s.checkRecord(s1));
		System.out.println(s2+":"+s.checkRecord(s2));
		System.out.println(s3+":"+s.checkRecord(s3));
		System.out.println(s4+":"+s.checkRecord(s4));

	}
}
