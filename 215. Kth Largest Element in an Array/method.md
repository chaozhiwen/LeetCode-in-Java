## 题目
在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
## 思路
先手写一个[快速排序](https://github.com/chaozhiwen/Algorithms/blob/master/Sort/Quick%20Sort/Quick.java)  
将数组排序，然后返回倒数第K个元素
## 算法复杂度
**时间复杂度**：O(n*log n)  
**空间复杂度**：O(1)
