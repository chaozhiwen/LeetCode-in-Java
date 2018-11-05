<h2>Question</h2>
You are given a string representing an attendance record for a student. The record only contains the following three characters:<br>
'A' : Absent.<br>
'L' : Late.<br>
'P' : Present.<br>
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).<br>
You need to return whether the student could be rewarded according to his attendance record.
<h2>Method</h2>
1.Taking the String traversal.If the current character is A,the counter plus one.<br>
2.Judging whether the String exists three consecutive character L.I use a way, that once the current character is L,judging the two characters after it
whether also is L.<br>
3.The end,judging the counter whether more than 1.
<h2>Algorithm Complexity</h2>
<b>Time Complexity:</b>O(n).I can't ensure that the next character of two consecutive character L is L,so I have to take String traversal one by one.<br>
<b>Space Complexity:</b>O(1)
