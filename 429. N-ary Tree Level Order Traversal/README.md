## 题目 
给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。  
## 思路
N叉树结构
```
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
```
层次遍历，类似于[二叉树的层次遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/102.%20Binary%20Tree%20Level%20Order%20Traversal)
```
/*
 *  广度优先搜索
 *  维护一个队列，首先将根节点入队
 *  队列中总是保存同一层节点，维护一个计数器，令其等于当前队列长度(同层节点数)
 *  队首节点不断出队，同时令出队节点的子节点入队
 *  当计数器归零时，表示当前层的节点访问完毕
 */
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int count=q.size();
            while(count>0){
                Node node=q.poll();
                list.add(node.val);
                for(int i=0;i<node.children.size();i++)
                    q.add(node.children.get(i));
                count--;
            }
            ans.add(list);
        }
        return ans;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，树的节点数  
**空间复杂度**：O(n)，遍历维护的队列
