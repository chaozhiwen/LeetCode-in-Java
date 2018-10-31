<h3>Question</h3>
transform roman to integer<br>
I-->1<br>
V-->5<br>
X-->10<br>
L-->50<br>
C-->100<br>
D-->500<br>
M-->1000<br>
<h3>Method</h3>
I didn't have a smart idea.I took string traversal three times.First,I transformed every roman letter into integer,meanwhile,I created an 
extra integer array.secondly,I found that if the roman digit is sequence,plus one by one.Otherwise,if it exits inverted sequence pair,later 
minus former and then set former as 0，to remove the inverted sequence.Last,adding each roman digit.<br>
<h3>Algorithm Complexity</h3>
first step:O(n)<br>
second step:O(n)<br>
last step:O(n)<br>
O(n)+O(n)+O(n)=O(n)
