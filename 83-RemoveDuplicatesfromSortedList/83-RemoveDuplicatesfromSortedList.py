# Last updated: 2/2/2026, 10:14:02 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def deleteDuplicates(self, head):
8        cur = head
9
10        while cur and cur.next:
11            if cur.val == cur.next.val:
12                cur.next = cur.next.next
13            else:
14                cur = cur.next
15
16        return head
17
18        