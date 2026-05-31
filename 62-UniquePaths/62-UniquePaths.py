# Last updated: 5/31/2026, 5:24:27 PM
1class Solution:
2    def uniquePaths(self, m, n):
3        dp = [1] * n
4
5        for i in range(1, m):
6            for j in range(1, n):
7                dp[j] = dp[j] + dp[j - 1]
8
9        return dp[n - 1]