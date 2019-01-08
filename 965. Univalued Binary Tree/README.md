## 题目
如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。  
只有给定的树是单值二叉树时，才返回 true；否则返回 false。
## 思路
```java
/*
 *  递归求解
 *  判断当前节点的值和左右子节点的值是否相等
 *  如果相等，则分别对左右子节点进行递归判断
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;//递归基(叶子节点的子节点)
        if(root.left!=null&&root.left.val!=root.val)//左节点
            return false;
        if(root.right!=null&&root.right.val!=root.val)//右节点
            return false;        
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
        
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，遍历树的时间  
**空间复杂度**：null
