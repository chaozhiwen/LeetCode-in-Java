<h3>Question</h3><br>
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their<br>
binary representation and return them as an array.<br>
Example:<br>
For num = 5 you should return [0,1,1,2,1,2].<br>
<h3>Method</h3><br>
1.create an integer array,its size equals given number plus 1<br>
2.traverse the numbers in the interval<br>
3.transform every number to binary,count the bit equals 1.<br>
<h3>Algorithm Complexity</h3><br>
O(n*(length of binary bit))=O(n)<br>
