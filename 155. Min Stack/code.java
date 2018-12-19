import java.util.*;
class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
        if(min.empty()||x<=min.peek())
            min.push(x);
    }
    
    public void pop() {
        if(s.empty())
            return;
        if(s.pop().equals(min.peek())&&!min.empty())//注意一定要用equals()方法，这里比较的是Integer对象
            min.pop();
   }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
	
}

/* simple test */
class Main{
	public static void main(String[] args){
		System.out.println("push(65),push(900),push(-1000),getMin(),pop(),push(50),push(-1),push(0),getMin(),pop(),pop(),push(-3),push(0),push(-2)");
		MinStack ms=new MinStack();
		ms.push(65);
		ms.push(900);
		ms.push(-1000);
		System.out.print(ms.getMin()+" ");
		ms.pop();
		ms.push(50);
		ms.push(-1);
		ms.push(0);
		System.out.print(ms.getMin()+" ");
		ms.pop();
		ms.pop();
		ms.push(-3);
		ms.push(0);
		ms.push(-2);
		System.out.println(ms.getMin()+" ");
		
	}
}
