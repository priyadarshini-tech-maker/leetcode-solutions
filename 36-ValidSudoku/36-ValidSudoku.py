# Last updated: 5/31/2026, 5:40:08 PM
1class Solution:
2    def isValidSudoku(self, board):
3        rows = [set() for _ in range(9)]
4        cols = [set() for _ in range(9)]
5        boxes = [set() for _ in range(9)]
6
7        for r in range(9):
8            for c in range(9):
9                num = board[r][c]
10
11                if num == '.':
12                    continue
13
14                box_index = (r // 3) * 3 + (c // 3)
15
16                if num in rows[r]:
17                    return False
18                if num in cols[c]:
19                    return False
20                if num in boxes[box_index]:
21                    return False
22
23                rows[r].add(num)
24                cols[c].add(num)
25                boxes[box_index].add(num)
26
27        return True