<h3>Question</h3>
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.<br>
<b>Note:</b><br>
1.The given integer is guaranteed to fit within the range of a 32-bit signed integer.<br>
2.You could assume no leading zero bit in the integer’s binary representation.<br>
<h3>Method</h3>
This time,I use the <b>provided API</b>.I transform the number to binary string,then,scanning every bit,changing 0 to 1 or 1 to 0.
There is a method named parseInt in class integer,it can transform binary string to decimal digit.
<h3>Algorithm Complexity</h3>
O(log n)
