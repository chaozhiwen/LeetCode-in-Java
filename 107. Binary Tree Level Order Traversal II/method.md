## 题目
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
## 思路
版本一：[自顶向下遍历](https://github.com/chaozhiwen/LeetCode-in-Java/blob/master/102.%20Binary%20Tree%20Level%20Order%20Traversal/code.java)  
在版本一中，遍历完一层，是将这一层的结点放入队列中。本题中遍历完一层，将这一层结点放入栈中。
## 算法复杂度
**时间复杂度**：O(n)  
**空间复杂度**：O(n)
