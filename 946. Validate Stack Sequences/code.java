import java.util.Stack;
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length) return false;
        Stack<Integer> s=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            s.push(pushed[i]);
            while(!s.empty()&&s.peek()==popped[j]){
                s.pop();
                j++;
            }
        }
        return s.empty();
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		int[] a1={};
		int[] a2={};
		System.out.println(s.validateStackSequences(a1,a2));//true
		
		int[] b1={1,2,3};
		int[] b2={1,2,3};
		System.out.println(s.validateStackSequences(b1,b2));//true
		int[] c={3,2,1};
		System.out.println(s.validateStackSequences(b1,c));//true
		
		int[] d1={1,2,3,4,5,6,7};
		int[] d2={3,4,5,2,1,6,7};
		System.out.println(s.validateStackSequences(d1,d2));//true
		int[] d3={3,4,5,1,2,6,7};
		System.out.println(s.validateStackSequences(d1,d3));//false
		
		int[] e1={1,2,3,4,5,6,7};
		int[] e2={7,5,6,4,3,2,1};
		System.out.println(s.validateStackSequences(e1,e2));//false
		
		int[] f1={100};
		int[] f2={};
		System.out.println(s.validateStackSequences(f1,f2));//false
	}
}
