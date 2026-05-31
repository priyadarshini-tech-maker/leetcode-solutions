# Last updated: 5/31/2026, 9:03:05 AM
1class Solution(object):
2    def digitFrequencyScore(self, n):
3        """
4        :type n: int
5        :rtype: int
6        """
7        s = str(n)
8        score = 0
9        for digit in set(s):
10            score += int(digit) * s.count(digit)
11        return score
12        