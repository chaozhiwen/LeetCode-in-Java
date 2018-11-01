<h2>Question</h2>
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that 
the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container
contains the most water.<br>
<b>Note:</b> You may not slant the container and n is at least 2.<br>
<h2>method</h2>
There are two keys,but I just master one.<br>
<b>Brute Force:</b><br>
1.To compute all area of each interval<br>
2.Searching the maximum area<br>
other key:<b>Two pointer</b>
<h2>Algorithmn Complexity</h2>
O(n²)<br>
Time Complexity:O(n²)-->because of twice traversal<br>
Space Complexity:O(1)
