# Last updated: 4/5/2026, 8:52:09 AM
1class Solution(object):
2    def mirrorFrequency(self, s):
3        """
4        :type s: str
5        :rtype: int
6        """
7        freq = Counter(s)
8        ans = 0
9        visited = set()
10        for ch in freq:
11            if ch in visited:
12               continue
13            if 'a' <= ch <= 'z':
14                mirror = chr(ord('z') - (ord(ch) - ord('a')))
15            else:
16                mirror = chr(ord('9') - (ord(ch) - ord('0')))
17            ans += abs(freq[ch] - freq.get(mirror, 0))
18            visited.add(ch)
19            visited.add(mirror)
20        return ans
21