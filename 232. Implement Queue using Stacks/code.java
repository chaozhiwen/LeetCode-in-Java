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
