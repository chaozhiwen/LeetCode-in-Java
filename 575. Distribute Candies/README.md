## 题目
给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大
糖果的种类数
## 思路
将所有糖果放入Set集合中，其中Set的大小是糖果的种类，每人能分到总数的一半。如果种类大于每人分到的，说明分到的每一个糖果都不同类，否则，每人能分到所有种类。
因此，比较种类的数量和每人分到的总数，取小者
## 算法复杂度
**时间复杂度**：O(n)，遍历数组  
**空间复杂度**：O(n)，维护Set集合