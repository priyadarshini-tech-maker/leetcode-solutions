# Last updated: 4/5/2026, 8:57:12 AM
1class Solution(object):
2    def findGoodIntegers(self, n):
3        """
4        :type n: int
5        :rtype: List[int]
6        """
7        cubes = []
8        i = 1
9        while i * i * i <= n:
10            cubes.append(i *  i * i)
11            i += 1
12        count = {}
13        m = len(cubes)
14        for i in range(m):
15            for j in range(i, m):
16                s = cubes[i] + cubes[j]
17                if s > n:
18                    break
19                count[s] = count.get(s, 0) + 1
20        ans = []
21        for x in sorted(count):
22            if count[x] >= 2:
23                ans.append(x)
24        return ans        
25        