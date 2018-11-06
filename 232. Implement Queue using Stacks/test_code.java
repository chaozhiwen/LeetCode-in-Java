import java.util.Stack;
class MyQueue {
    Stack<Integer> s;
    /** Initialize your data structure here. */
    public MyQueue() {
        s=new Stack<Integer>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s.empty()){
            s.push(x);
        }else{
            Stack<Integer> temp=new Stack<>();
            while(!s.empty()){
                temp.push(s.pop());
            }
            s.push(x);
            while(!temp.empty()){
                s.push(temp.pop());
            }
        }
    }    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int i=0;
        if(s.empty()){
            return 0;
        }else{
            return s.pop();
        }
    }  
    /** Get the front element. */
    public int peek() {
        if(s.empty()){
            return 0;
        }else{
            return s.peek();
        }
    }  
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty();
    }
}

class Main{
	public static void main(String[] args){
		MyQueue q=new MyQueue();
		System.out.println("Operation:");
		System.out.print("empty(),push(1),push(2),push(3),push(4),empty(),pop(),pop(),pop(),pop(),empty():"+q.empty()+" ");
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		System.out.print(q.empty()+" ");
		while(!q.empty()){
			System.out.print(q.pop()+" ");
		}
		System.out.println(q.empty());
		
		
		
	}
}
