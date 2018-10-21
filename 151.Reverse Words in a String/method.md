<h3>1.Title</h3><br>
Given an input string, reverse the string word by word.<br>
For example:<br>
Given s = "the sky is blue",<br>
return "blue is sky the"<br>
<h3>2.method</h3>    <br>
1)让字符串中的每一个字符入队<br>
2)队列元素依次出队，将出队的字符组合成新的字符串，直到队首字符为空格，此时让新的字符串入栈，而后此字符串置空，队首的空格字符出队单独入栈。   <br>
3)栈中元素依次出栈，组合成字符串<br>
<b>值得注意的是</b>，首尾都是空格以及中间有连续的空格<br>
<h3>3.Algorithmic Complexity：</h3>O(n)<br>
time:O(3n)<br> 
space:O(2n)<br>
