## 题目
给定一个 N 叉树，找到其最大深度。  
最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。 
## 思路
```java
class Solution {
/*
 *  在层遍历的基础上，维护一个整型变量ans，初始为0
 *  每遍历完一层，ans递增1
 *  直到抵达最后一个节点
 */
    public int maxDepth(Node root) {
        if(root==null) return 0;
        
        int ans=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                Node node=q.poll();
                for(int i=0;i<node.children.size();i++)
                    q.add(node.children.get(i));
                count--;
            }
            ans++;
        }
        return ans;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，需要对树进行层遍历  
**空间复杂度**：O(n)，层遍历时维护的队列
