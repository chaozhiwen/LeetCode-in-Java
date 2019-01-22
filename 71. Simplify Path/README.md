## 题目
[简化路径](https://leetcode-cn.com/problems/simplify-path/)
## 思路
```java
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();//辅助栈
        String[] tmp=path.split("/");//将路径按'/'划分成字符串数组
        for(String s:tmp){//保留有效路径
            if(s.equals("")||s.equals("."))//若路径名为空或'.'，可以理解为多余路径
                continue;
            else if(s.equals("..")){//若路径为返回标志
                if(!stack.empty())//同时满足之前有路径
                    stack.pop();//则退出之前的路径
            }else//若不满足以上，可认为是有效路径
                stack.push(s);//将路径压入栈中
        }//当循环结束时，栈中保留着有效的路径名
        if(stack.empty())
            return "/";
        String res="";
        while(!stack.empty())
            res="/"+stack.pop()+res;
        return res;
        
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)--拆分字符串为数组O(n)+遍历数组O(n)+遍历栈O(n)=O(3n)  
**空间复杂度**：O(n)--拆分字符串为数组O(n)+维护栈O(n)=O(2n)
