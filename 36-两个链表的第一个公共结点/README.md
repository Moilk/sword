时间限制：1秒 空间限制：32768K 热度指数：229454

本题知识点： [链表](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=580)

## 题目描述

输入两个链表，找出它们的第一个公共结点。

## 解题说明

先分别遍历两个链表，得到他们的长度，计算长度之差 k，然后再遍历一次，让长的链表先走 k 步，两个再一起走，遇到第一个相同的节点，这个节点就是第一个交点。