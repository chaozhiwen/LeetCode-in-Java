## 题目
在二叉树的每一行中找到最大的值
## 思路
```java
/*
 *  基于层次遍历，广度优先搜索
 *  使用队列结构，将每一层节点从左至右依次入队，从中找值最大的节点
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        
        if(root==null) return ans;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                max=Math.max(max,tmp.val);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            ans.add(max);
        }
        return ans;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，树的层遍历所花费时间  
**空间复杂度**：O(n)，层次遍历需要维护队列
