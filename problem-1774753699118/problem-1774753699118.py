# Last updated: 3/29/2026, 8:38:19 AM
1class Solution(object):
2    def firstMatchingIndex(self, s):
3        """
4        :type s: str
5        :rtype: int
6        """
7        n = len(s)
8        for i in range(n):
9            if s[i] == s[n - i - 1]:
10                return i
11        return -1        
12
13