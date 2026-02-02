// Last updated: 2/2/2026, 10:03:00 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        return check(root.left,root.right);
19    }
20    public boolean check(TreeNode n1, TreeNode n2)
21    {
22        if(n1 == null && n2 == null) return true;
23        if(n1 == null || n2 == null) return false;
24        if(n1.val != n2.val) return false;
25        return check (n1.left,n2.right) && check(n1.right,n2.left);
26        }
27    }
28        
29        
30