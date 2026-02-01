// Last updated: 2/1/2026, 3:57:58 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18
19
20        // Case 1: both are null
21        if (p == null && q == null) {
22            return true;
23        }
24
25        // Case 2: one is null
26        if (p == null || q == null) {
27            return false;
28        }
29
30        // Case 3: values are same
31        if (p.val == q.val) {
32            return isSameTree(p.left, q.left)
33                && isSameTree(p.right, q.right);
34        }
35
36        // Case 4: values are different
37        return false;
38    }
39}
40