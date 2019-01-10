## 题目
给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
## 思路
深度优先搜索，利用栈结构，采用中序遍历  
题目中的k可认为是计数器，BST的中序遍历的就是顺序访问树中节点。因此，没访问一个节点，计数器递减，直到为0，说明此节点是第k小的
```java
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int ans=0;
        if(root==null) return ans;
        Stack<TreeNode> s=new Stack<>();
        while(true){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            if(k-->0){
                root=s.pop();
                ans=root.val;
                root=root.right;
            }
            else //计数器归零
                return ans;
        }
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，遍历树的时间开销  
**空间复杂度**：O(n)，中序遍历额外的栈的开销
