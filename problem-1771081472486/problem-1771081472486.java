// Last updated: 2/14/2026, 8:34:32 PM
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        Map<String, Integer> map = new HashMap<>();
4        for(String word:words) {
5            if(word.length() >= k) {
6                String prefix = word.substring(0, k);
7                map.put(prefix, map.getOrDefault(prefix, 0)+1);
8            }
9        }
10        int count = 0;
11        for(int freq:map.values()) {
12            if(freq>=2) {
13                count++;
14            }
15        }
16        return count;
17        
18    }
19}