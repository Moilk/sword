时间限制：1秒 空间限制：32768K 热度指数：200454

本题知识点： [队列](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=582) [树](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=583)

## 题目描述

请实现两个函数，分别用来序列化和反序列化二叉树

## 解题说明

序列化的时候把二叉树转成前序遍历序列，空节点用 `#` 表示，每个节点用 `,` 隔开

反序列化的时候把字符串用 `,` 分割成数组，然后转成 `List`，以 `ListIterator` 的方式访问，反序列化的过程类似前序遍历。

