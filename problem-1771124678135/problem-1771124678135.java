// Last updated: 2/15/2026, 8:34:38 AM
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        for(int n : nums) {
5            freq.put(n, freq.getOrDefault(n, 0)+1);
6        }
7        Map<Integer, Integer> freqCount = new HashMap<>();
8        for(int f : freq.values()) {
9            freqCount.put(f, freqCount.getOrDefault(f, 0)+1);
10            
11        }
12        for(int n : nums) {
13            int f = freq.get(n);
14            if(freqCount.get(f) == 1) {
15                return n;
16            }
17        }
18        return  -1;
19        
20    }
21}