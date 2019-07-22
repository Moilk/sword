时间限制：1秒 空间限制：32768K 热度指数：208830

本题知识点： [字符串](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=579) [进制转化](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=1201)

## 题目描述

将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。

## 输入描述:

```
输入一个字符串,包括数字字母符号,可以为空
```

## 输出描述:

```
如果是合法的数值表达则返回该数字，否则返回0
```

示例1

## 输入

[复制](javascript:void(0);)

```
+2147483647
    1a33
```

## 输出

[复制](javascript:void(0);)

```
2147483647
    0
```