# Last updated: 5/24/2026, 8:26:14 AM
1class Solution(object):
2    def passwordStrength(self, password):
3        """
4        :type password: str
5        :rtype: int
6        """
7        lower = set()
8        upper = set()
9        digit = set()
10        special = set()
11        specials = "!@#$%^&*()-+"
12        for ch in password:
13            if 'a' <= ch <= 'z':
14               lower.add(ch)
15            elif 'A' <= ch <= 'z':
16               upper.add(ch)
17            elif '0' <= ch <= '9':
18               digit.add(ch)
19            elif ch in specials:
20               special.add(ch)
21        strength = (
22            len(lower) * 1 +
23            len(upper) * 2 +
24            len(digit) * 3 +
25            len (special) * 5
26        )  
27
28        return strength
29            
30
31            
32        