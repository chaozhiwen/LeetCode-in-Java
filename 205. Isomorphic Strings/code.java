import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        Map<Character,Character> mapS=new HashMap<>();
        Map<Character,Character> mapT=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mapS.containsKey(s.charAt(i)))
                mapS.put(s.charAt(i),t.charAt(i));
            if(!mapT.containsKey(t.charAt(i)))
                mapT.put(t.charAt(i),s.charAt(i));
            if(mapT.get(t.charAt(i))!=s.charAt(i)||mapS.get(s.charAt(i))!=t.charAt(i))
                return false;
        }    
        return true;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		System.out.println(s.isIsomorphic("app","egg"));
		System.out.println(s.isIsomorphic("aaa","abc"));
		System.out.println(s.isIsomorphic("abc","aaa"));
		System.out.println(s.isIsomorphic("",""));
		System.out.println(s.isIsomorphic("abc","a"));
		System.out.println(s.isIsomorphic("a","abc"));
		System.out.println(s.isIsomorphic("abacabac","popipopi"));
		System.out.println(s.isIsomorphic("aqwq","poop"));
	}
}
