class MyStack {
    Queue<Integer> q;
    /** Initialize your data structure here. */
    public MyStack() {
        q=new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(q.isEmpty()){
            q.add(x);
        }else{
            Queue<Integer> temp=new LinkedList<>();
            while(!q.isEmpty()){
                temp.add(q.poll());
            }
            q.add(x);
            while(!temp.isEmpty()){
                q.add(temp.poll());
            }
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q.isEmpty()){
            return 0;
        }else{
            return q.poll();
        }
    }
    
    /** Get the top element. */
    public int top() {
        if(q.isEmpty()){
            return 0;
        }else{
            return q.peek();
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
