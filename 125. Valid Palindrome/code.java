class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            while(i<s.length()-1&&!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            if(i>=j)
                return true;
            
            while(j>0&&!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(i>=j)
                return true;
            
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
            
        }                
        return true;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.isPalindrome(""));//true
		System.out.println(s.isPalindrome("/.,"));//true
		System.out.println(s.isPalindrome("98765432123456789"));//true
		System.out.println(s.isPalindrome("abcCBA"));//true
		System.out.println(s.isPalindrome("i m a b o y y y o b a m m i"));//false
		System.out.println(s.isPalindrome("i love you uoy love i"));//false
		System.out.println(s.isPalindrome("i"));//true
		System.out.println(s.isPalindrome("i1"));//false
		System.out.println(s.isPalindrome("l;'"));//true
		System.out.println(s.isPalindrome(";212/"));//true	
	}
}
