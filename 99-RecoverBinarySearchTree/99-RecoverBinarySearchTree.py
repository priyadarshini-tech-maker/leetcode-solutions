# Last updated: 2/4/2026, 10:52:18 PM
1# Definition for a binary tree node.
2# class TreeNode(object):
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution(object):
8    def recoverTree(self, root):
9        self.first = None
10        self.second = None
11        self.prev = None
12
13        def inorder(node):
14            if not node:
15                return
16
17            inorder(node.left)
18
19            # violation found
20            if self.prev and self.prev.val > node.val:
21                if not self.first:
22                    self.first = self.prev
23                self.second = node
24
25            self.prev = node
26            inorder(node.right)
27
28        inorder(root)
29
30        # swap the wrong values
31        self.first.val, self.second.val = self.second.val, self.first.val
32
33        """
34        :type root: Optional[TreeNode]
35        :rtype: None Do not return anything, modify root in-place instead.
36        """
37        