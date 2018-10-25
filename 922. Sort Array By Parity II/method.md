<h3>Question</h3>
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
You may return any answer array that satisfies this condition.
<h3>Method</h3>
1.create two stacks to reserve odds and evens<br>
2.traverse array,push odds to odd-stack,push evens to even-stack<br>
3.traverse array again,when rank is even,this element equals the element that pop the even-stack.the same way to odd<br>
<h3>Algorithm Complexity</h3><br>
<b>Note</b><br>It' not the best key<br>
I create extra two stacks and traverse array twice,it's stupid.<br>
O(n)
