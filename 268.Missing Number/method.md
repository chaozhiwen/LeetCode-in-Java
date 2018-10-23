<h3>Question</h3><br>
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.<br>
Example 2:<br>
Input: [9,6,4,2,3,5,7,0,1]<br>
Output: 8<br>
<b>Note:</b>Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?<br>
<h3>Method</h3><br>
1.obtain the sum of the array<br>
2.obtain the sum of which is from zero to length of array<br>
3.return the difference of the former and the later<br>
<h3>Algorithm Complexity</h3><br>
O(n)
