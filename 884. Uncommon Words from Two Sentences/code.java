import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        A=A+" "+B;
        String[] s=A.split(" ");
        Map<String,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length;i++){
            if(map.containsKey(s[i]))
                map.put(s[i],map.get(s[i])+1);
            else
                map.put(s[i],1);
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<s.length;i++)
            if(map.get(s[i])==1)
                ans.add(s[i]);
        
        
        return ans.toArray(new String[ans.size()]);
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		String[] s1=s.uncommonFromSentences("a","b");
		for(String i:s1)
			System.out.print("\""+i+"\""+" ");
		System.out.println();
		
		String[] s2=s.uncommonFromSentences("I love you","I do not love you");
		for(String i:s2)
			System.out.print("\""+i+"\""+" ");
		System.out.println();
		
		String[] s3=s.uncommonFromSentences("letter a is first one","letter A is first one");
		for(String i:s3)
			System.out.print("\""+i+"\""+" ");
		System.out.println();
		
		String[] s4=s.uncommonFromSentences("","");
		for(String i:s4)
			System.out.print("\""+i+"\""+" ");
		System.out.println();
		
		String[] s5=s.uncommonFromSentences("computer science","science computer");
		for(String i:s5)
			System.out.print("\""+i+"\""+" ");
		System.out.println();
	}
}
