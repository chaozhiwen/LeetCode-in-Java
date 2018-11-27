import java.util.*;
class Solution{
    public char findTheDifference(String s, String t){
        HashMap<Character,Integer> s1=new HashMap<>();
        
        //将s中每个字符添加到映射中
        for(int i=0;i<s.length();i++){
            if(s1.containsKey(s.charAt(i)))//如果映射中存在这个键
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);//字符是键，字符的数量为值+1
            else//如果这个映射中没有这个键
                s1.put(s.charAt(i),1);//将字符作为键放入映射中，值为1
        }
        
        //检查t的字符出现次数
        for(int i=0;i<t.length();i++){
            if(s1.containsKey(t.charAt(i))){//如果映射中包含此键
                s1.put(t.charAt(i),s1.get(t.charAt(i))-1);//将相映的值-1
                if(s1.get(t.charAt(i))==0)//判断该键值是否为零，
                    s1.remove(t.charAt(i));//为零则删除此键
            }
            else//如果映射中不包含此键
                return t.charAt(i);//返回此键
        }
        return ' ';
    }
}
/***simple example***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.findTheDifference("abcd","abcde"));
		System.out.println(s.findTheDifference("a","aa"));
		System.out.println(s.findTheDifference("","a"));
		System.out.println(s.findTheDifference("sncnodhfardsafhioawhfjjahfioadhsdiaodhsoaidheuifhuasfncaencyawwncfashfuiahmxajdioaafsdaafdfapweoreuiqoheqwsdhauidyiauxneauixaoofuaoisfuoaipgyxag","sncnodhfardsafhioawhfjjahfioadhsdiaodhsoaidheuifhuasfncaencyawwncfashfuiahmxajdioaafsdaafdfapweoreuiqoheqwsdhauidyiauxneauixaoofuaoisfuoaeipgyxag"));
		
	}
}
