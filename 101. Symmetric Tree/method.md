<h2>Question</h2>
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
<h2>Method</h2>
I use queue to iterate.To put leftNode and rightNode,if it is a mirror,the two elements of queue head must be equality.Note that the 
sequence of adding Node to queue,it means that you must follow the order,as follow<br>
<b>leftTree leftNode->rightTree rightNode,leftTree rightNode->rightTree leftNode.</b>
<h2>Algorithm Complexity</h2>
Time Complexity:O(n) I have to take the whole treeNode traversal<br>
Space Compexity:O(n) To create a queue to reserve all treeNodes
