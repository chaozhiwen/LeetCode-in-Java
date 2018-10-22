<h3>Question</h3><br>
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.<br>
Example:<br>
Input: [0,1,0,3,12]<br>
Output: [1,3,12,0,0]<br>
Note:<br>
1.You must do this in-place without making a copy of the array.<br>
2.Minimize the total number of operations.<br>
<h3>Method</h3><br>
1.create two pointers,fast&slow<br>
2).fast pointer traverses the array and search nonzero-elements<br>
3).slow pointer records the zero's number and reserve the nonzero-elements<br>
2.traverse array,once find the nonzero-element,move it to the place where the slow pointer points at<br>
3.slow pointer point backward<br>
4.reset the value of elements to zero from tail to head,distance is count<br>
<h3>3.Algorithmic Complexity：</h3><br>
O(n)
