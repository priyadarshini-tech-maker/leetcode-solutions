# Last updated: 3/15/2026, 8:55:06 AM
1class Solution(object):
2    def countCommas(self, n):
3        """
4        :type n: int
5        :rtype: int
6        """
7        ans = 0
8        start = 1000
9        commas = 1
10        while start <= n:
11            end = min(n, start * 1000 - 1)
12            ans += (end - start + 1) * commas
13            start *= 1000
14            commas += 1
15        return ans
16        