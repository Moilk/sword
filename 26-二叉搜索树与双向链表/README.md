时间限制：1秒 空间限制：32768K 热度指数：275073

本题知识点： [链表](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=580) [树](https://www.nowcoder.com/questionCenter?questionTypes=000100&mutiTagIds=583)

## 题目描述

输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

## 解题说明

用 `last` 指针指向双端链表的最后一个节点，中序遍历二叉树，访问节点 `p` 时，让 `last.right = p` 且 `p.left = last`，这样不断进行下去就可以把二叉树转成双端链表，最后记得把第一个节点的 `left` 指针置空。