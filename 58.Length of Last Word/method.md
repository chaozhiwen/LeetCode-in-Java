<h3>1.Question</h3><br>
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.<br>
Note: A word is defined as a character sequence consists of non-space characters only.<br>
Example:<br>
Input: "Hello World"<br>
Output: 5<br>
<h3>2.Method</h3><br>
1).removing all the space character in head and tail of the string<br>
2).conversing the string to character array<br>
3).creating a stack which reserves the character<br>
4).traversing the inverted array<br>
5).pushing every element to stack unless meeting the space character<br>
6).return stack's size<br>
<h3>3.Algorithmic Complexity：</h3><br>
O(n)


