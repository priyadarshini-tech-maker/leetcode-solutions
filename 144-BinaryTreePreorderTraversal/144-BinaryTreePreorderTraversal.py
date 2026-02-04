# Last updated: 2/4/2026, 10:49:39 PM
1# Definition for a binary tree node.
2# class TreeNode(object):
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution(object):
8    def preorderTraversal(self, root):
9        result = []
10        self.preOrderRec(root, result)
11        return result
12
13    def preOrderRec(self, root, result):
14        if root is None:
15            return
16
17        result.append(root.val)          # ROOT
18        self.preOrderRec(root.left, result)   # LEFT
19        self.preOrderRec(root.right, result)  # RIGHT
20
21        """
22        :type root: Optional[TreeNode]
23        :rtype: List[int]
24        """
25        