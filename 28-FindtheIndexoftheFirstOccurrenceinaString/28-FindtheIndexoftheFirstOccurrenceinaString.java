// Last updated: 1/28/2026, 11:00:01 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3    
4        int hLen = haystack.length();
5        int nLen = needle.length();
6
7        for (int i = 0; i <= hLen - nLen; i++) {
8            if (haystack.substring(i, i + nLen).equals(needle)) {
9                return i;
10            }
11        }
12
13        return -1;
14    }
15}
16
17        
18    