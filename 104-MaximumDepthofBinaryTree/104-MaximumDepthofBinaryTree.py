# Last updated: 2/3/2026, 10:54:24 PM
1# Definition for a binary tree node.
2# class TreeNode(object):
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution(object):
8    def maxDepth(self, root):
9        if root is None:
10            return 0
11        
12        left = self.maxDepth(root.left)
13        right = self.maxDepth(root.right)
14        
15        return max(left, right) + 1
16
17        """
18        :type root: Optional[TreeNode]
19        :rtype: int
20        """
21        