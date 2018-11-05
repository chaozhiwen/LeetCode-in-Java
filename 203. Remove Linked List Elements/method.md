<h2>Question</h2>
Remove all elements from a linked list of integers that have value val<br>
<h2>Method</h2>
1.Judging whether the first node is null<br>
2.Loop.Judging whether the value of head node equals the value to remove,if it is,the head node moves to the next node. This step will remove ,in the front of list,the repeat elements which equal the to remove value.<br>
3.Creating a new head node.Loop.If the current value equals value to remove,ignoring the next node,set next node of current node as the next node of next node,till the node is null.
<h2>Algorithm Complexity</h2>
<b>Time Complexity:</b>O(n).List traversal<br>
<b>Space Complexity:</b>O(1)
