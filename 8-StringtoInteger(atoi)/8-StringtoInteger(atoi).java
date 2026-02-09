// Last updated: 2/9/2026, 8:33:51 PM
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0)
4            return 0;
5
6        int i = 0;
7        int n = s.length();
8        while (i < n && s.charAt(i) == ' ') {
9            i++;
10        }
11        if (i == n) return 0;
12        int sign = 1;
13        if (s.charAt(i) == '+') {
14            i++;
15        } else if (s.charAt(i) == '-') {
16            sign = -1;
17            i++;
18        }
19        long result = 0;  
20
21        while (i < n && Character.isDigit(s.charAt(i))) {
22            result = result * 10 + (s.charAt(i) - '0');
23            if (sign * result > Integer.MAX_VALUE)
24                return Integer.MAX_VALUE;
25            if (sign * result < Integer.MIN_VALUE)
26                return Integer.MIN_VALUE;
27
28            i++;
29        }
30
31        return (int) (sign * result);
32    }
33}
34
35        
36    