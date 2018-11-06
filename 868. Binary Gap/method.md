<h2>Question</h2>
Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.<br>
If there aren't two consecutive 1's, return 0.
<h2>Method</h2>
1.Transforming number to binary string.<br>
2.Finding index of number 1 and reserving it to a vessel.<br>
3.Taking the index traversal,then finding the maximum element.
<h2>Algorithm Complexity</h2>
<b>Time Complexity:</b>O(log n)<br>
I scan the binary string.<br>
<b>Space Complexity:</b>O(log n)<br>
Because of the vessel,it reserves a part of binary string.
