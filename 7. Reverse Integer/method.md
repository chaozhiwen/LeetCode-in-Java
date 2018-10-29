<h3>Question</h3>
Given a 32-bit signed integer, reverse digits of an integer.<br>
<b>note:</b><br>
Assume we are dealing with an environment which could only store integers within the 32-bit signed 
integer range: <b>[Integer.MIN_VALUE, Integer.MAX_VALUE]</b>. For the purpose of this problem, assume that your function returns
0 when the reversed integer overflows.
<h3>Method</h3>
1.create a long Integer to reserve the reversed number,because the reversed number might be unbounded 
2.judge the reversed number if it is more than <b>Integer.MAX_VALUE</b> or less than <b>Integer.MIN_VALUE</b><br>
<b>note</b><br>
The reversed number is easy to be out of bound,so I create a more bit type to reserve it.If not,we will prejudge
if the number arrive the border every cycle,it spend so much time
<h3>Algorithm Complexity</h3>
O(log n)
