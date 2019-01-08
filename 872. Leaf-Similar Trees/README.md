## 题目
[问题链接](https://leetcode-cn.com/problems/leaf-similar-trees/)
## 思路
~~一开始，我想到用广度优先搜索，但是最后我发现，这种算法无法保证叶子节点的顺序~~    
使用深度优先搜索，建立在二叉树的中序遍历上。维护一个List容器，对树展开中序遍历，当且仅当 当前节点无子节点时，在List中添加该节点的值。对另一颗树执行
同样的操作。最后比较两个List是否相等。
```java
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leaf(root1).equals(leaf(root2));
    }
    
    //返回List，记录参数树的所有叶子节点
    public static List<Integer> leaf(TreeNode node){
        List<Integer> ans=new ArrayList<>();
        if(node==null) return ans;
        
        //中序遍历
        Stack<TreeNode> s=new Stack<>();
        while(true){
            while(node!=null){
                s.push(node);
                node=node.left;
            }
            if(s.empty())
                break;
            node=s.pop();
            if(node.left==null&&node.right==null)
                ans.add(node.val);
            node=node.right;
        }        
        return ans;
    }
}
```
## 算法复杂度
**时间复杂度**：O(m+n),两棵树的节点数之和  
**空间复杂度**：O(m+n),两棵树的叶子节点以及遍历时所用的栈
