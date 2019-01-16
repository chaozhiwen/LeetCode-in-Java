## 题目
[问题链接](https://leetcode-cn.com/problems/license-key-formatting/)
## 思路
```java
//分为2个步骤
public String licenseKeyFormatting(String S, int K) {
      /*
       *  1.将字符串中的破折号去掉
       *    这里我是用了可编辑的字符串StringBuffer
       *    遍历字符串，将所有除'-'字符追加到StringBuffer后面
       */
        StringBuffer s=new StringBuffer();
        if(K==0) return S.toUpperCase();
        for(int i=0;i<S.length();i++)
            if(S.charAt(i)!='-')
                s.append(S.charAt(i));
        /*
         *  2.在得到的StringBuffer上添加'-'
         *    维护一个计数器，由后至前，寻找插入位置
         *    当指针未指向非首字符时，将破折号插入
         */
        for(int i=s.length()-1;i>=0;i--){
            int count=K;
            while(count-->1&&i>=0)
                i--;
            if(i>0)
                s.insert(i,'-');
        }
        return s.toString().toUpperCase();
    }
```
## 算法复杂度
**时间复杂度**：O(n)，遍历字符串的开销  
**空间复杂度**：O(n)，维护StringBuffer的空间
