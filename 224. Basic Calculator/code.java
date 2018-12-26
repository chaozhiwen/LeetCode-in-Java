/*
 *  运算符 ：+-
 *  优先级符 ：()
 */

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Character> sym=new Stack<>();//符号栈
        Stack<Integer> dig=new Stack<>();//数字栈
        
        s+=")";
        sym.push('(');
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;//遇到空格
            
            //遇到'(','+','-',直接入符号栈
            else if(s.charAt(i)=='('||s.charAt(i)=='+'||s.charAt(i)=='-')
                sym.push(s.charAt(i));
            
            //遇到')'，展开计算
            else if(s.charAt(i)==')'){
                char tmp=sym.pop();//弹出符号栈顶
                //非加即减，然后将结果压入数字栈   
                while(tmp=='+'||tmp=='-'){
                    int v1=dig.pop();
                    int v2=dig.pop();//弹出数字栈两项

                    if(tmp=='+')
                        dig.push(v1+v2);
                    else if(tmp=='-')
                        dig.push(v2-v1);
                    tmp=sym.pop();
                 }       
                
            }
            
            
            else{
                //遇到数字，做压栈操作
                
                String tmp="";
                //多位数的整数
                for(;i<s.length()&&Character.isDigit(s.charAt(i));i++)
                    tmp+=s.charAt(i);
                i--;
                int digit=Integer.valueOf(tmp);
                dig.push(digit);
                
                //回过头，判断符号栈顶是否为运算符
                if(sym.peek()=='+'||sym.peek()=='-'){
                    int d1=dig.pop();
                    int d2=dig.pop();
                    
                    if(sym.pop()=='+')
                        dig.push(d2+d1);
                    else
                        dig.push(d2-d1);
                }
            }
        }       
        return dig.pop();
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		String s1="1+1+1";
		System.out.println(s.calculate(s1));
		
		String s2="1-(1+1)";
		System.out.println(s.calculate(s2));
		
		String s3="1+1";
		System.out.println(s.calculate(s3));
		
		String s4="(1+1)";
		System.out.println(s.calculate(s4));
		
		String s5="1+3-(6-(5+2))";
		System.out.println(s.calculate(s5));
		
		String s6="(1+(4+5+2)-3)+(6+8)";
		System.out.println(s.calculate(s6));
		
		String s7="(7)+(4)";
		System.out.println(s.calculate(s7));
		
		String s8="(7)+(4)+(9)";
		System.out.println(s.calculate(s8));

	}
}
