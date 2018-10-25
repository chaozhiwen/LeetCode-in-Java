<h3>Question</h3>
Input: 19<br>
Output: true<br>
Explanation: <br>
12 + 92 = 82<br>
82 + 22 = 68<br>
62 + 82 = 100<br>
12 + 02 + 02 = 1<br>
if the end is 1,return true<br>
<h3>Method</h3>
I enumerate many numbers and find that difficulty can be simplified,because all the numbers can be reduced to 0~9.By obtaining the 
quadratic sum constantly,if final consequense is less than 10，meanwhile it equals 1 or 7,it means this number is a happy number.Otherwise,
it will be in a endless loop,terminate circulation<br>
<h3>Algority Complexity</h3>
O(log n)
