// Last updated: 6/3/2026, 6:25:30 AM
1class Solution {
2    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
3        int answer1 = 0;
4        int answer2 = 0;
5
6        // Count for nums1
7        for (int i = 0; i < nums1.length; i++) {
8            for (int j = 0; j < nums2.length; j++) {
9                if (nums1[i] == nums2[j]) {
10                    answer1++;
11                    break;
12                }
13            }
14        }
15
16        // Count for nums2
17        for (int i = 0; i < nums2.length; i++) {
18            for (int j = 0; j < nums1.length; j++) {
19                if (nums2[i] == nums1[j]) {
20                    answer2++;
21                    break;
22                }
23            }
24        }
25
26        return new int[]{answer1, answer2};
27    }
28}
29