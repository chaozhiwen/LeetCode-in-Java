<h2>Question</h2>
We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.<br>
<h2>Method</h2>
1.It means that the tail value can't be 1<br>
2.Taking array traversal,if current value is 1,reserving current and next element in vessel(Vector).<br>
3.judging the end element in vessel whether it is 0.
<h2>Algorithm Complexity</h2>
The worst situation is that all the elements equal 1.We have to reserve all elements in vessel.<br>
<b>Time Complexity:</b>O(n)<br>
<b>Space Complexity:</b>O(n)//It depends on the count of 1.
