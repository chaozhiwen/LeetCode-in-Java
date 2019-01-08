## 题目
给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
## 思路
首先，对于BST结构，站在任意节点，其左子树一定不大于此节点，右子树一定不小于此节点  
对于BST的搜索来说，可以等效的转换为有序数组的二分查找  
BST搜索的过程：先从根节点出发，如果待查数小于根节点，那么摒弃右子树，在左子树中查找。反之，摒弃左子树，在右子树中查找。
然后对左子树或右子树重复上述步骤，直到节点为空或相等
```java
//递归
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val)
            return root;
        else if(root.val<val)
            root=root.right;
        else
            root=root.left;    
        return searchBST(root,val);
    }
}
```
```java
//迭代
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val==val)
                return root;
            else if(root.val>val)
                root=root.left;
            else
                root=root.right;
        }
        return root;
    }
}
```
## 算法复杂度
**时间复杂度**：O(h)，h为树的深度  
**空间复杂度**：O(1)
