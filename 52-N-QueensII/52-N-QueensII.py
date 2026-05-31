# Last updated: 5/31/2026, 5:59:23 PM
1class Solution:
2    def totalNQueens(self, n):
3        cols = set()
4        diag1 = set()  # row - col
5        diag2 = set()  # row + col
6
7        def backtrack(row):
8            if row == n:
9                return 1
10
11            count = 0
12
13            for col in range(n):
14                if col in cols or (row - col) in diag1 or (row + col) in diag2:
15                    continue
16
17                cols.add(col)
18                diag1.add(row - col)
19                diag2.add(row + col)
20
21                count += backtrack(row + 1)
22
23                cols.remove(col)
24                diag1.remove(row - col)
25                diag2.remove(row + col)
26
27            return count
28
29        return backtrack(0)