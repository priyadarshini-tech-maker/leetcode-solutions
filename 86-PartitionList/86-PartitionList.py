# Last updated: 5/31/2026, 6:19:53 PM
1class Solution:
2    def partition(self, head, x):
3        smaller = ListNode(0)
4        greater = ListNode(0)
5
6        small = smaller
7        large = greater
8
9        while head:
10            if head.val < x:
11                small.next = head
12                small = small.next
13            else:
14                large.next = head
15                large = large.next
16
17            head = head.next
18
19        large.next = None
20        small.next = greater.next
21
22        return smaller.next