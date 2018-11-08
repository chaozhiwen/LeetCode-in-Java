import java.util.*;
class Solution {
    public int hammingDistance(int x, int y) {
        Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<Integer>();
        int count=0;
        while(x!=0){
            q1.add(x%2);
            x/=2;
        }
        while(y!=0){
            q2.add(y%2);
            y/=2;
        }
        while(!q1.isEmpty()&&!q2.isEmpty()){
            if(q1.poll()!=q2.poll()){
                count++;
            }
        }
        if(q1.isEmpty()){
            while(!q2.isEmpty()){
                if(q2.poll()==1)
                    count++;
            }
        }else if(q2.isEmpty()){
            while(!q1.isEmpty()){
                if(q1.poll()==1){
                    count++;
                }
            }
        }
        return count;
    }
}
class Main {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.hammingDistance(6,7));
		System.out.println(s.hammingDistance(0,0));
		System.out.println(s.hammingDistance(1,2));
		System.out.println(s.hammingDistance(3,4));
		System.out.println(s.hammingDistance(19,29));
		System.out.println(s.hammingDistance(Integer.MAX_VALUE,Integer.MAX_VALUE-1));
	}

}
