// Last updated: 6/1/2026, 2:04:39 PM
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) return "0";
4
5        char[] hexMap = "0123456789abcdef".toCharArray();
6        StringBuilder sb = new StringBuilder();
7        while (num != 0 && sb.length() < 8) {
8            int digit = num & 15;   
9            sb.append(hexMap[digit]);
10            num >>>= 4;             
11        }
12
13        return sb.reverse().toString();
14    }
15}
16