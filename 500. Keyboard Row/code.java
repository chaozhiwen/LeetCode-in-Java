import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop";
        String s2="asdfghjkl ";
        String s3="zxcvbnm   ";
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),1);
            map.put(s2.charAt(i),2);
            map.put(s3.charAt(i),3);
        }
        
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int tmp=map.get(words[i].toLowerCase().charAt(0));
            boolean flag=true;
            for(int j=1;j<words[i].length();j++){
                if(tmp!=map.get(words[i].toLowerCase().charAt(j))){
                    flag=false;
                    break;
                }
            }
            if(flag)
                res.add(words[i]);
        }
        return res.toArray(new String[0]);
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String[] s1={"asdfg","qwert","zxcvb"};
		String[] s2={"ASDFG","QWERT","ZXCVB"};
		String[] s3={"qaz","wsx","edc","rfv","tgb","yhn","ujm"};
		String[] s4={};
		String[] s5={"a","v","e","r","g","t","h","j","v","c","d","u","i"};
		
		for(String p:s.findWords(s1))
			System.out.print(p+" ");
		System.out.println();
		for(String p:s.findWords(s2))
			System.out.print(p+" ");
		System.out.println();
		for(String p:s.findWords(s3))
			System.out.print(p+" ");
		System.out.println();
		for(String p:s.findWords(s4))
			System.out.print(p+" ");
		System.out.println();
		for(String p:s.findWords(s5))
			System.out.print(p+" ");
		System.out.println();
		
	}
}
