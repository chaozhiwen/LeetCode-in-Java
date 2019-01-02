import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            Set<Character> h=new HashSet<>();
            h.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!h.contains(s.charAt(j)))
                   h.add(s.charAt(j));
                else
                    break;
                
            }
            ans=Math.max(ans,h.size());
        }
        return ans;
    }
        
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		System.out.println(s.lengthOfLongestSubstring(""));
		System.out.println(s.lengthOfLongestSubstring(" "));
		System.out.println(s.lengthOfLongestSubstring("  "));
		System.out.println(s.lengthOfLongestSubstring("abc"));
		System.out.println(s.lengthOfLongestSubstring("aabcd"));
		System.out.println(s.lengthOfLongestSubstring("abacd"));
		System.out.println(s.lengthOfLongestSubstring("abcda"));
		System.out.println(s.lengthOfLongestSubstring("chaozhiwen"));
		System.out.println(s.lengthOfLongestSubstring("qwertyuiopasdfghjklzxcvbnm"));
		System.out.println(s.lengthOfLongestSubstring("aaaaaaaaaab"));
		System.out.println(s.lengthOfLongestSubstring("acdaaaaaaaaaar"));
		System.out.println(s.lengthOfLongestSubstring("aaaaaaaaaaaaaaa"));
		
	}
}
