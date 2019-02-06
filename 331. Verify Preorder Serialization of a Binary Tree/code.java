class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder.charAt(0)=='#'&&preorder.length()==1) return true;
        if(preorder.charAt(0)=='#') return false;

        int count=1;
        String[] s=preorder.split(",");
        if(s.length%2==0) return false;
        for(int i=0;i<s.length;i++){
            if(count==0) return false;
            if(s[i].charAt(0)=='#') count--;
            else if(Character.isDigit(s[i].charAt(0))) count++;
        }
        return count==0;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.isValidSerialization("#"));
		System.out.println(s.isValidSerialization("#,#"));
		System.out.println(s.isValidSerialization("#,1,3"));
		System.out.println(s.isValidSerialization("1"));
		System.out.println(s.isValidSerialization("1,#,3"));
		System.out.println(s.isValidSerialization("1,#,3,#,#"));
		System.out.println(s.isValidSerialization("1,2,3,4,#,3,2,#,#,#,#,#,5,2,#,#,#"));
	}
}
