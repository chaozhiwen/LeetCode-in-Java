import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s=str.split(" ");
        if(s.length!=pattern.length()) return false;
        
        Map<Character,String> mapP=new HashMap<>();
        Map<String,Character> mapS=new HashMap<>();
        for(int i=0;i<s.length;i++){ 
            if(!mapP.containsKey(pattern.charAt(i)))
                mapP.put(pattern.charAt(i),s[i]);
            if(!mapS.containsKey(s[i]))
                mapS.put(s[i],pattern.charAt(i));
            if(!mapP.get(pattern.charAt(i)).equals(s[i])||mapS.get(s[i])!=pattern.charAt(i))
                return false;
        }
        return true;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		System.out.println(s.wordPattern("app","eclipse go go"));
		System.out.println(s.wordPattern("aaa","apple banana car"));
		System.out.println(s.wordPattern("abc","apple apple apple"));
		System.out.println(s.wordPattern("",""));
		System.out.println(s.wordPattern("abc","apple"));
		System.out.println(s.wordPattern("a","apple apple apple"));
		System.out.println(s.wordPattern("abacabac","paper orange paper ice paper orange paper ice"));
		System.out.println(s.wordPattern("aqwq","paper orange orange paper"));
	}
}
