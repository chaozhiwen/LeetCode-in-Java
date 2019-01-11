## 题目
给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
## 思路
```java
class Solution {
    Set<Integer> set=new HashSet<>();//创建成员变量set，将节点的值放入set中
    /*
     *  递归函数，参数TreeNode,int，返回boolean
     *  先判断当前set中是否存在一个值，目标结果-当前节点的值
     *  如果存在，则说明有两个节点满足条件
     *  否则，将当前节点的值放入set中
     *  对左子树和右子树分别递归，直到叶子节点，说明没找到
     */
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);       
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，树节点的数量  
**空间复杂度**：O(n)，递归程序隐型栈O(n)+维护set集合O(n)，n为树节点数量
