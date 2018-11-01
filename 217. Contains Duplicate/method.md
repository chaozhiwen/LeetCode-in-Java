<h2>Question</h2>
Given an array of integers, find if the array contains any duplicates.<br>
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.<br>
<h2>Method</h2>
<b>Brute Force</b><br>
Searching them one-by-one.<br>
<b>HashSet</b><br>
The reduplicate elements is not allowed to exist in hashset.Puting all of elements in hashset.Comparing the orinal size of array with size of hashset.<br>
<b>Sort</b><br>
Sorting array,then searching the reduplicate elements<br>
<h2>Algorithm Complexity</h2>
<b>Brute Force:</b>O(n²)<br>
It is similar to bubble sort,but not real sorting.If the slow pointer moves,the quick pointer must scan the remaining elements.<br>
<b>HashSet:</b>O(n)<br>
Time Complexity:O(n)<br>
Space Complexity:O(n)<br>
<b>Sort:</b>O(n²)<br>
Time Complexity:O(n²)<br>
Space Complexity:O(n)
