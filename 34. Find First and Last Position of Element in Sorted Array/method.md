<h2>Question</h2>
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.<br>
Your algorithm's runtime complexity must be in the order of O(log n).<br>
If the target is not found in the array, return [-1, -1].
<h2>Method</h2>
1.Creating two pointers,they point at the first and last elements.<br>
2.The front pointer always moves backwards,the back pointer always moves frontwards.<br>
3.Once,one of pointers first finds the target,the current pointer stays the current position.The other pointer keeps moving,until two pointers meet or 
both of two pointers find their target.<br>
<h2>Algorithm Complexity</h2>
<b>Time Complexity:O(log n)</b><br>
The worst situation is O(n/2):the target doesn's exist in array.<br>
I have two pointers that move at the same time,so I can take array traversal in half time.<br>
<b>Space Complexity:O(1)</b><br>
Nothing extra is created.
