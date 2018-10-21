class Solution {
    public String reverseWords(String s) {
        String s1=s.replaceAll(" ", "");
        if(s1.replaceAll(" ", "").equals(""))
            return "";
        s=s.trim();
        char[] ch=s.toCharArray();
        Queue<Character> q=new LinkedList();
        q.add(ch[0]);
        for(int i=1;i<ch.length;i++){         
            //字符串中每个字符入队
            if(Character.isSpaceChar(ch[i])&&Character.isSpaceChar(ch[i-1]))
                continue;
            q.add(ch[i]);
        }
        String tmp="";
        Stack<String> st=new Stack();
        while(q.size()!=0){
            if(!Character.isSpaceChar(q.peek())){//不是空格
                tmp+=q.poll();//出队，与前一字符组成字符串
            }else{//是空格
                st.push(tmp);//之前字符串入栈
                tmp="";//置空
                st.push(q.poll()+"");//空格入栈
            }
        }
		st.push(tmp);
        String St="";
        while(st.size()!=0){
            St+=st.pop();
        }
        return St;
    }
}
