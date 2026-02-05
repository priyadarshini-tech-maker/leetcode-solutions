// Last updated: 2/5/2026, 5:26:38 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5
6        List<List<Integer>> pascal = new ArrayList<>();
7
8        for (int i = 0; i < numRows; i++) {
9
10            List<Integer> row = new ArrayList<>();
11
12            for (int j = 0; j <= i; j++) {
13
14                // first and last element
15                if (j == 0 || j == i) {
16                    row.add(1);
17                } 
18                // middle elements
19                else {
20                    List<Integer> previousRow = pascal.get(i - 1);
21                    row.add(previousRow.get(j - 1) + previousRow.get(j));
22                }
23            }
24
25            pascal.add(row);
26        }
27
28        return pascal;
29    }
30}
31