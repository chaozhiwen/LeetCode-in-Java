## 题目
给定一个二叉树，在树的最后一行找到最左边的值。
## 思路
题目实质上是要找到二叉树的最后一层的最左边的节点
```java
/*
 *  通过层次遍历，找到最左边的节点
 *  每一次迭代时，队首节点一定是该层的最左边的节点
 *  因此，只需要在每次访问一层节点之前，维护一个树节点类型变量，用来记录即将访问层的最左边节点即可
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int ans=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.peek();
            if(node.left==null&&node.right==null)
                ans=node.val;
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                if(tmp.left!=null) 
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }   
        }
        return ans;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，层次遍历的时间开销  
**空间复杂度**：O(n)，层次遍历需要维护队列
