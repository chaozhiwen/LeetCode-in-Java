## 题目
给定一个二叉树，判断其是否是一个有效的二叉搜索树。  
假设一个二叉搜索树具有如下特征：  
1.节点的左子树只包含小于当前节点的数。  
2.节点的右子树只包含大于当前节点的数。  
3.所有左子树和右子树自身必须也是二叉搜索树。
## 思路

```java
/*
 *  BST，若树的中序遍历所得序列的具有单调性，那么此树为二叉搜索树
 *  本题中，维护两个树节点，其中pre在中序遍历中表示上一节点，cur代表当前节点
 *  在BST中，节点pre始终小于节点cur
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode cur=root;//当前结点
        TreeNode pre=null;//上一结点
        
        while(true){
            while(cur!=null){
                s.push(cur); 
                cur=cur.left;
            }
            if(s.empty())
                break;
            cur=s.pop();
            //判断两结点的单调性
            if(pre!=null&&pre.val>=cur.val)
                return false;
            pre=cur;
            cur=cur.right;
        }
        
        return true;
    }
}
```

## 算法复杂度
**时间复杂度**：O(n)，遍历每一个结点所花费的时间  
**空间复杂度**：O(n)，中序遍历迭代的方式需要维护一个栈
