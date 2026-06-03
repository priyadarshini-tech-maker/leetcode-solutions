// Last updated: 6/3/2026, 6:20:59 AM
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        HashSet<Integer> set1 = new HashSet<>();
6        HashSet<Integer> resultSet = new HashSet<>();
7
8        for (int num : nums1) {
9            set1.add(num);
10        }
11
12        for (int num : nums2) {
13            if (set1.contains(num)) {
14                resultSet.add(num);
15            }
16        }
17
18        int[] result = new int[resultSet.size()];
19        int i = 0;
20
21        for (int num : resultSet) {
22            result[i++] = num;
23        }
24
25        return result;
26    }
27}