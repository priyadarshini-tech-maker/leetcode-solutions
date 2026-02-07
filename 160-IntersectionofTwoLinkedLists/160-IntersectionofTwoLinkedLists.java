// Last updated: 2/7/2026, 10:36:39 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14
15        // Step 1: If any list is empty
16        if (headA == null || headB == null)
17            return null;
18
19        // Step 2: Two pointers
20        ListNode ptr1 = headA;
21        ListNode ptr2 = headB;
22
23        // Step 3: Move pointers until they meet
24        while (ptr1 != ptr2) {
25
26            // If ptr1 ends, jump to headB
27            ptr1 = (ptr1 != null) ? ptr1.next : headB;
28
29            // If ptr2 ends, jump to headA
30            ptr2 = (ptr2 != null) ? ptr2.next : headA;
31        }
32
33        // Step 4: Intersection node or null
34        return ptr1;
35    }
36}
37