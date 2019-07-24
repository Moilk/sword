时间限制：1秒 空间限制：32768K 热度指数：201099

本题知识点： [栈](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=581) [树](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=583)

## 题目描述

请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。

## 解题说明

层序遍历二叉树，遍历的同时统计当前层已遍历的节点数、下一层节点的节点数和层数，换层时提交当前层的数据，根据层数判断是否要做 `reverse`。

也可以用两个双向队列来存放当前层节点和下一层节点，这样就不需要做 `reverse` 了。

