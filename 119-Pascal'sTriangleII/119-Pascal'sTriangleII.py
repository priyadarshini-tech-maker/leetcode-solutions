# Last updated: 2/5/2026, 5:55:50 PM
1from typing import List
2
3class Solution:
4    def getRow(self, rowIndex: int) -> List[int]:
5        res = [1]
6
7        for i in range(rowIndex):
8            nextRow = [0] * (len(res) + 1)
9
10            for j in range(len(res)):
11                nextRow[j] += res[j]
12                nextRow[j + 1] += res[j]
13
14            res = nextRow   # ✅ move this OUTSIDE inner loop
15
16        return res
17