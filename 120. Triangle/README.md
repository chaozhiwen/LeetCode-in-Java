## 题目
给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
## 思路
**动态规划**  
```java
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1) return triangle.get(0).get(0);
        
        //将每一个位置上的最小路径和保存在该位置上
        for(int i=1;i<triangle.size();i++)
            for(int j=0;j<triangle.get(i).size();j++){
                //当该位置处于三角形的边时，只有一条路径
                if(j==0)//最左边
                    triangle.get(i).set(j,triangle.get(i-1).get(0)+triangle.get(i).get(0));
                else if(j==triangle.get(i).size()-1)//最右边
                    triangle.get(i).set(j,triangle.get(i-1).get(j-1)+triangle.get(i).get(j));
                //若该位置在三角形内时，选择左上或右上较小的路径
                else
                    triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1)));
            }
        //最后，三角形的最小路径的出口落在了最后一行(底)，经过比较，找到最小路径和
        List<Integer> last=triangle.get(triangle.size()-1);
        int ans=last.get(0);
        for(int i=0;i<last.size();i++)
            ans=Math.min(ans,last.get(i));
        return ans;
    }
```
## 算法复杂度
**时间复杂度**：O(m\*n)  
**空间复杂度**：O(1)
