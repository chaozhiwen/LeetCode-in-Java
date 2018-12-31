## 题目
给定一个二叉树，找出其最大深度。  
二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。  
说明: 叶子节点是指没有子节点的节点。
## 思路
由[102.层次遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/102.%20Binary%20Tree%20Level%20Order%20Traversal)可得。知道其层数，
必然可以得到最大深度。不直接访问具体结点，只需统计出层数即可
## 算法复杂度
**时间复杂度**：O(n)  
**空间复杂度**：O(n)
