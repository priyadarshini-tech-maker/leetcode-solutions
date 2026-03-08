// Last updated: 3/8/2026, 8:35:27 AM
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int minCapacity = Integer.MAX_VALUE;
4        int index = -1;
5        for(int i=0; i<capacity.length; i++) {
6            if(capacity[i] >= itemSize) {
7                if(capacity[i] < minCapacity) {
8                    minCapacity = capacity[i];
9                    index = i;
10                }
11            }
12        }
13        return index;
14        
15    }
16}