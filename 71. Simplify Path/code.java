import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        
        String[] tmp=path.split("/");
        for(String s:tmp){
            if(s.equals("")||s.equals("."))
                continue;
            else if(s.equals("..")){
                if(!stack.empty())
                    stack.pop();
            }
            else
                stack.push(s);
        }
        if(stack.empty())
            return "/";
        String res="";
        while(!stack.empty())
            res="/"+stack.pop()+res;
        return res;
        
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.simplifyPath("/a/b/c"));
		System.out.println(s.simplifyPath("/a//c/s/./"));
		System.out.println(s.simplifyPath("/../"));
		System.out.println(s.simplifyPath("/a//.//./b//c/d/../h///"));
		System.out.println(s.simplifyPath("a/../../b/../c"));
	}
}
