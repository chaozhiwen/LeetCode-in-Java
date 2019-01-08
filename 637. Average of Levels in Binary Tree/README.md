## 题目
给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
## 思路
```java
/*
 *  根据二叉树的层次遍历，将二叉树每层的节点的值统计出来
 *  广度优先搜索，利用队列结构，每一层节点总是顺序地存储在队列中
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null) return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();//计数器
            int x=count;//记录层节点个数
            double sum=0.0;//记录层节点值的总和
            
            while(count>0){//当计数器等于0时，表示当前层节点访问完毕
                TreeNode tmp=q.poll();
                sum+=tmp.val;
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            res.add(sum/x);
        }
        return res;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，遍历树节点  
**空间复杂度**：O(n)，层次遍历时，维护的队列所用空间
