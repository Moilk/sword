时间限制：1秒 空间限制：32768K 热度指数：420505

本题知识点： [字符串](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=579) [动态规划](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=593) [递归](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=591)

## 题目描述

输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

## 输入描述:

```
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
```

## 解题说明

全排列问题，先把字符串转成数组，然后用 start 把数组分成两段，左边为已经确定的序列，右边为不确定的序列。对于从 start 开始的不确定序列，遍历每个 start 的可能性，遍历时，如果判断 start 位置的字符应该是 str[i]，就把 start 和 i 位置的元素交换，然后递归，递归完了再把两个位置交换回来。