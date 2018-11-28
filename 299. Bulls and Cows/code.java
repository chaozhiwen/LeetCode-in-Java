import java.util.*;
class Solution {
    public String getHint(String secret, String guess){
        int countA=0;//公牛
        int countB=0;//总数
        
        /*确定公牛*/
        for(int i=0;i<secret.length();i++)
            if(secret.charAt(i)==guess.charAt(i))
                countA++;
        
        /*确定总数*/
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<secret.length();i++){//先将秘密数字作为键放入map中，值为该数字出现的频率
            if(m.containsKey(secret.charAt(i))){
                m.put(secret.charAt(i),m.get(secret.charAt(i))+1);//如果有重复的键，令值+1
                continue;
            }
            m.put(secret.charAt(i),1);//否则直接添加键，值为1
        }//结束后，接着用猜测数的字每个数字和map中的键作比较
        for(int i=0;i<guess.length();i++){
            if(m.containsKey(guess.charAt(i))){//如果map包含猜测数字的当前数字
                countB++;
                m.put(guess.charAt(i),m.get(guess.charAt(i))-1);//令此键所对映的值-1
                if(m.get(guess.charAt(i))==0)//如果此键的值为0，说明当前键不会再被猜对
                    m.remove(guess.charAt(i));//那么删除此键
            }           
        }
        return countA+"A"+(countB-countA)+"B";//母牛等于总数减公牛
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.getHint("1234","4321"));
		System.out.println(s.getHint("7788","1781"));
		System.out.println(s.getHint("5678","1234"));
		System.out.println(s.getHint("1234","1234"));
		System.out.println(s.getHint("1234567891234567894561234567891234567891","9632587412365478965478963214578965212687"));
	}
}

