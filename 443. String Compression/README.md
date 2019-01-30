## 题目
给定一组字符，使用原地算法将其压缩。  
压缩后的长度必须始终小于或等于原数组长度。    
数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。  
在完成原地修改输入数组后，返回数组的新长度。
## 思路
需要3个指针
- 修改原数组中的元素--指针point  
- 游历相同元素--指针j
- 遍历数组--指针i

```java
public int compress(char[] chars) {
    int point=0;
    for(int i=0;i<chars.length;i++){
        int count=1;//设置计数器，初始为1
        for(int j=i+1;j<chars.length&&chars[i]==chars[j];j++)
            count++;//接着检查其后元素，遇到相同元素计数器叠加
            
        chars[point++]=chars[i];//将当前访问元素放在point指针处，同时point指针向后移动
        if(count==1) continue;
        i=i+count-1;//将遍历指针移动到所有最后一个相同元素后
        String c=count+"";
        for(int k=0;k<c.length();k++)//将相同元素的数量记录在point指针
            chars[point++]=c.charAt(k);            
    }
    return point;
}  
```
## 算法复杂度
- 时间复杂度：O(n)  
- 空间复杂度：O(1)
