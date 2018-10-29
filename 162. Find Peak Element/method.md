<h3>Question</h3><br>
Example 1:<br>
Input: nums = [1,2,3,1]<br>
Output: 2<br>
Explanation: 3 is a peak element and your function should return the index number 2.<br>
Example 2:<br>
Input: nums = [1,2,1,3,5,6,4]<br>
Output: 1 or 5 <br>
Explanation: Your function can return either index number 1 where the peak element is 2,
             or index number 5 where the peak element is 6.<br>
<b>Note:</b>
Your solution should be in logarithmic complexity.
<h3>Method</h3><br>
array traversal,find elenment that is greater than the next one.<br>
<b>note:</b>when array is empty,return -1
<h3>Algorithm Complexity</h3><br>
O(log n)<br>
the worst condition is scan the whole array O(n)<br>
the best condition is first element is taget O(1)
