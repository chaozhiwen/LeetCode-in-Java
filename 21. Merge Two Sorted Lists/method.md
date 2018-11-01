<h2>Question</h2>
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two 
lists.<br>
Example:<br>
Input: 1->2->4, 1->3->4<br>
Output: 1->1->2->3->4->4<br>
<h2>Method</h2>
1.Creating a new list to reserve the sorted list.<br>
2.comparing values of two current nodes,putting smaller one in new list.Then, smaller pointer moves to the next element.The other pointer 
stays in the same place.<br>
3.Repeating step 2,until one or both of the two nodes become null pointer.<br>
4.The end of cycle,maybe the pointer points at a non-null list.put all remaining element in new list.
<h2>Algorithm Complexity</h2>
O(l1.length+l2.length)=O(n)<br>
Time Complexity:O(n)<br>
Space Complexity:O(1)
