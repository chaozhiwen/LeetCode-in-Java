## 题目
给定一个二叉树，判断它是否是高度平衡的二叉树。
## 思路
```java
    //首先，统计出当前节点的高度
    private int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
```
```java
   //判读树是否平衡，判断条件：树中每一节点左子树高度与右子树高度的差的绝对值不大于1
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;      
        if(Math.abs(height(root.left)-height(root.right))>1)
            return false;        
        return isBalanced(root.left)&&isBalanced(root.right);
    }
```
## 算法复杂度
**时间复杂度**：O(n^2)，重复计算每一个节点的高度  
**空间复杂度**：O(n^2)，递归栈
