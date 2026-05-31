# Last updated: 5/31/2026, 5:22:21 PM
1class Solution:
2    def reverse(self, x):
3        sign = -1 if x < 0 else 1
4        x = abs(x)
5
6        rev = 0
7        while x:
8            rev = rev * 10 + x % 10
9            x //= 10
10
11        rev *= sign
12
13        if rev < -2**31 or rev > 2**31 - 1:
14            return 0
15
16        return rev