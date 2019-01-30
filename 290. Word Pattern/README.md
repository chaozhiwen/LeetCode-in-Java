## 题目
给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。  
这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
## 思路
1. 首先使用split()方法，将字符串以空格划分开来
2. 构建两个Map映射，一个映射以pattern为键、str为值，另一映射以str为值、pattern为键  
3. 检查两个映射中键对应的值是否为当前位置上对应的pattern或str
```java
        for(int i=0;i<s.length;i++){ 
            if(!mapP.containsKey(pattern.charAt(i)))
                mapP.put(pattern.charAt(i),s[i]);
            if(!mapS.containsKey(s[i]))
                mapS.put(s[i],pattern.charAt(i));
            if(!mapP.get(pattern.charAt(i)).equals(s[i])||mapS.get(s[i])!=pattern.charAt(i))
                return false;
        }
```
## 算法复杂度
- 时间复杂度：O(n)
- 空间复杂度：O(n)
