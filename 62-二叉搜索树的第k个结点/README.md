时间限制：1秒 空间限制：32768K 热度指数：228796

本题知识点： [栈](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=581) [树](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=583)

## 题目描述

给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。

## 解题说明

按照使用栈进行中序遍历的思路，其中节点访问的时机是在节点从栈中弹出的时候，每弹出一个节点，k 减一，当 k 等于 0 的时候，弹出的那个节点就是第 k 个元素。