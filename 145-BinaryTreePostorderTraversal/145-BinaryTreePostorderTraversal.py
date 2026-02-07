# Last updated: 2/7/2026, 11:35:10 PM
1# Definition for a binary tree node.
2# class TreeNode(object):
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def postorderTraversal(self, root):
9        result = []
10
11        def dfs(node):
12            if node is None:
13                return
14            dfs(node.left)     # LEFT
15            dfs(node.right)    # RIGHT
16            result.append(node.val)  # ROOT
17
18        dfs(root)
19        return result
20