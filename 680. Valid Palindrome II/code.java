class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);
            else{i++;j--;}
        }
        return true;
    }
    
    private boolean isPalindrome(String s,int i,int j){
        if(i>j) return false;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.validPalindrome("aaaaa"));
		System.out.println(s.validPalindrome("a"));
		System.out.println(s.validPalindrome("aaaba"));
		System.out.println(s.validPalindrome("baaba"));
		System.out.println(s.validPalindrome("aaabb"));
		System.out.println(s.validPalindrome(""));
		System.out.println(s.validPalindrome("132asd-*//*-dsa321"));
		System.out.println(s.validPalindrome("123asd-*//*-dsa321"));
	}
}
