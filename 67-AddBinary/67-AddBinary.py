# Last updated: 1/26/2026, 7:35:08 PM
1class Solution:
2    def addBinary(self, a: str, b: str) -> str:
3        # convert binary strings to integers and add
4        x = bin(int(a, 2) + int(b, 2))
5        
6        # remove '0b' from the result
7        return x[2:]
8
9        