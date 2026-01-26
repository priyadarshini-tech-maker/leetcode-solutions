// Last updated: 1/26/2026, 7:01:23 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s=s.stripTrailing();
4        int length=0;
5        for(int i=s.length()-1;i>=0;i--) {
6            if(s.charAt(i)==' ') {
7                return length;
8            }
9            length++;
10        }
11        return length;
12    }
13}
14