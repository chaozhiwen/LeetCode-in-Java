import java.util.*;
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> h=new HashSet<>();
        //遍历数组
        for(int i=0;i<emails.length;i++){
            String temp="";//存放最简地址
            int j=0;//指针
			
            //访问元素中'@'之前的字符
            for(;j<emails[i].length();j++){//其中，
                if(emails[i].charAt(j)=='@')//访问到'@'时，
                    break;//结束。
                else if(emails[i].charAt(j)=='+'){//访问到'+'时，
                    while(emails[i].charAt(j)!='@')//将指针移动至'@'之前的位置，
                        j++;//然后，
                    break;//结束。
                }
                else if(emails[i].charAt(j)=='.')//当访问到'.'时，
                    continue;//将其忽略。
                temp+=emails[i].charAt(j);
            }//结束后，接着访问'@'及之后的字符
            for(;j<emails[i].length();j++)
                temp+=emails[i].charAt(j);
            h.add(temp);
        }
        return h.size();         
    }
}
/***simple example***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String[] a={"chaozhiwen@qq.com","chao.zhi.wen@qq.com","chaozhiwen+chaozhiwen@qq.com"};
		String[] b={"chaozhiwen@q.q.com","chaozhiwen@q+q.com","chaozhiwen@qq.com"};
		System.out.println(s.numUniqueEmails(a));
		System.out.println(s.numUniqueEmails(b));
	}
}
