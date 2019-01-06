## 题目
给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
## 思路
在[层次遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/102.%20Binary%20Tree%20Level%20Order%20Traversal)的基础上，
当计数器为1时，代表当前队首结点是这一层的最右边结点。
## 算法复杂度
**时间复杂度**：O(n)，遍历树的时间开销  
**空间复杂度**：O(n)，遍历树所维护的队列
