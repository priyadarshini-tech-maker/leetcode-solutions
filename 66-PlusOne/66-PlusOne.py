# Last updated: 2/3/2026, 10:55:51 PM
1class Solution(object):
2    def plusOne(self, digits):
3        n = len(digits)
4
5        # Start from last digit
6        for i in range(n - 1, -1, -1):
7            if digits[i] < 9:
8                digits[i] += 1
9                return digits
10            else:
11                digits[i] = 0
12
13        # If all digits were 9
14        return [1] + digits
15
16        """
17        :type digits: List[int]
18        :rtype: List[int]
19        """
20        