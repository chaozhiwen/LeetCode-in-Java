<h3>Question</h3><br>
A self-dividing number is a number that is divisible by every digit it contains.<br>
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.<br>
Also, a self-dividing number is not allowed to contain the digit zero.<br>
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.<br>
Example 1:<br>
Input: left = 1, right = 22<br>
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]<br>
<h3>method</h3><br>
<b>it's a stupid method</b><br>
1.travese every integer in the interval<br>
2.judge the number that if it can be divisible by every digit it contains<br>
3.ignore the number that it contains zero<br>
<b>I am unable to get every digit that the number contains,so i transform these numbers to string,to character array,again and again.
In this way,i increace the complexity</b><br>
<h3>Algorithm Complexity</h3><br>
O(n²)
