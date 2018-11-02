<h2>Question</h2>
Example:<br>
Input: words = ["gin", "zen", "gig", "msg"]<br>
Output: 2<br>
Explanation: <br>
The transformation of each word is:<br>
"gin" -> "--...-."<br>
"zen" -> "--...-."<br>
"gig" -> "--...--."<br>
"msg" -> "--...--."<br>
There are 2 different transformations, "--...-." and "--...--.".<br>
<h2>Method</h2>
I use hashset,because duplicate elements are not allowed to be reserved in this type of data structure.
Translating every words to Morse Code,then put them in the set.How to tranlate every letter.It is one-to-one match--between letter and Morse Code,so I ues switch strcture to
make reflection.<br>
<h2>Algorithm Complexity</h2>
O(n)<br>
Although it is a nest loop,it just take once traversal.The output loop scans the elements in array.The inner 
loop scans letter in element.<br>
Time Complexity:O(n)<br>
Space Complexity:O(n)
