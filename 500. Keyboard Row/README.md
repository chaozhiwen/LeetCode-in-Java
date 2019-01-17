## 题目
[键盘行](https://leetcode-cn.com/problems/keyboard-row/)
## 思路
```java
        //先建立一组映射，Character-Integer，同层字母的值相同
        String s1="qwertyuiop";
        String s2="asdfghjkl ";
        String s3="zxcvbnm   ";        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),1);
            map.put(s2.charAt(i),2);
            map.put(s3.charAt(i),3);
        }
```
```java
        List<String> res=new ArrayList<>();//维护一个List容器，存放符合条件的字符串
        for(int i=0;i<words.length;i++){//挨个访问数组中的字符串
            boolean flag=true;//标识符
            int tmp=map.get(words[i].toLowerCase().charAt(0));//查看当前字符串的第一个字符的在映射中的值
            for(int j=1;j<words[i].length();j++)//和剩下字符在映射中的值逐个比较
                if(tmp!=map.get(words[i].toLowerCase().charAt(j))){//若有不相同的值
                    flag=false;//标识符改变
                    break;
                }
            if(flag)
                res.add(words[i]);
        }
```
## 算法复杂度
**时间复杂度**：O(m\*n)，数组长度*每个元素的长度  
**空间复杂度**：O(1)，设定的映射大小总是不变
