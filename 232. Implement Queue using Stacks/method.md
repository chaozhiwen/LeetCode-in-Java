<h2>Question</h2>
Implement the following operations of a queue using stacks.<br>
push(x) -- Push element x to the back of queue.<br>
pop() -- Removes the element from in front of queue.<br>
peek() -- Get the front element.<br>
empty() -- Return whether the queue is empty.
<h2>Method</h2>
1.Initializing a stack in constructor.<br>
2.Push().I consider the sequence,that the head of queue is the tail of stack.So I create a temp stack,poping all the elements to temp stack,this step can ensure the sequence of elements.Then adding element to original stack.Last,pushing all elements to original stack.If  the original stack is empty,adding element to empy one.<br>
3.peek().Because of step 2,it ensure the sequence,so I can return the first element direct.But if there is no element in stack,returning 0.<br>
4.pop().Refering to step 3.<br>
5.empty().
<h2>Algorithm Complexity</h2>
step 1:O(1)<br>
step 2:<br>
Time Complexity:O(n^2).I have to take all elements traversal twice,pop() and push().<br>
Space Complexity:O(n).I create the other stack to reserve all the elements.<br>
step 3:O(1)<br>
step 4:O(1)<br>
step 5:O(1)<br>
