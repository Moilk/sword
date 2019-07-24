时间限制：1秒 空间限制：32768K 热度指数：159551

本题知识点： [队列](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=582) [树](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=583)

## 题目描述

从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。

## 解题说明

层序遍历二叉树，用一个队列来保存节点，并统计当前层遍历了的节点数，和遍历的同时添加进队列的下一层节点数，当遍历数达到当前层的大小时，提交一次，切换到下一层。