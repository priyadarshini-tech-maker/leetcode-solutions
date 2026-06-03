// Last updated: 6/3/2026, 6:24:00 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
5
6        List<Integer> list1 = new ArrayList<>();
7        List<Integer> list2 = new ArrayList<>();
8
9        // Elements in nums1 but not in nums2
10        for (int i = 0; i < nums1.length; i++) {
11
12            boolean presentInNums2 = false;
13            for (int j = 0; j < nums2.length; j++) {
14                if (nums1[i] == nums2[j]) {
15                    presentInNums2 = true;
16                    break;
17                }
18            }
19
20            boolean alreadyAdded = false;
21            for (int k = 0; k < list1.size(); k++) {
22                if (list1.get(k) == nums1[i]) {
23                    alreadyAdded = true;
24                    break;
25                }
26            }
27
28            if (!presentInNums2 && !alreadyAdded) {
29                list1.add(nums1[i]);
30            }
31        }
32
33        // Elements in nums2 but not in nums1
34        for (int i = 0; i < nums2.length; i++) {
35
36            boolean presentInNums1 = false;
37            for (int j = 0; j < nums1.length; j++) {
38                if (nums2[i] == nums1[j]) {
39                    presentInNums1 = true;
40                    break;
41                }
42            }
43
44            boolean alreadyAdded = false;
45            for (int k = 0; k < list2.size(); k++) {
46                if (list2.get(k) == nums2[i]) {
47                    alreadyAdded = true;
48                    break;
49                }
50            }
51
52            if (!presentInNums1 && !alreadyAdded) {
53                list2.add(nums2[i]);
54            }
55        }
56
57        List<List<Integer>> answer = new ArrayList<>();
58        answer.add(list1);
59        answer.add(list2);
60
61        return answer;
62    }
63}