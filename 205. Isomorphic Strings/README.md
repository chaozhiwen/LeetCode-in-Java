## 题目
给定两个字符串 s 和 t，判断它们是否是同构的。  
如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。  
所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。  
## 思路
1. 构建两个映射，分别以两个字符串的每个字符作为键，另一字符串相同位置上的字符作为值
```java
        Map<Character,Character> mapS=new HashMap<>();
        Map<Character,Character> mapT=new HashMap<>();
```
2. 遍历两个字符串，检查映射中是否存在以当前字符为键的映射，添加映射。
3. 再检查当前位置上，以此字符为键的两个映射的值，是否是当前位置另一字符串中的字符(检查对映关系)
```java
        for(int i=0;i<s.length();i++){
            if(!mapS.containsKey(s.charAt(i)))
                mapS.put(s.charAt(i),t.charAt(i));
            if(!mapT.containsKey(t.charAt(i)))
                mapT.put(t.charAt(i),s.charAt(i));
            if(mapT.get(t.charAt(i))!=s.charAt(i)||mapS.get(s.charAt(i))!=t.charAt(i))
                return false;
        } 
```
## 算法复杂度
- 时间复杂度：O(n)  
- 空间复杂度：O(n)
