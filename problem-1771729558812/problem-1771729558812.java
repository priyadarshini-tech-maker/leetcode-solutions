// Last updated: 2/22/2026, 8:35:58 AM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int[] digitorials = {1,2,145,40585};
4        String input = String.valueOf(n);
5        int[] inputCount = getDigitCount(input);
6        for(int num : digitorials) {
7            String candidate = String.valueOf(num);
8            if(candidate.length() != input.length())
9            {
10                continue;
11            }
12            if(candidate.charAt(0) == '0') {
13                continue;
14            }
15            int[] candidateCount = getDigitCount(candidate);
16            if(matches(inputCount, candidateCount)) {
17                return true;
18            }
19        }
20        return false;
21        
22    }
23    private int[] getDigitCount(String s) {
24        int [] count = new int[10];
25        for(char c : s.toCharArray()) {
26            count[c - '0']++;
27        }
28        return count;
29    }
30    private boolean matches(int[] a, int[] b) {
31        for(int i=0;i<10;i++) {
32            if(a[i] !=b[i]) {
33                return false;
34            }
35        }
36        return true;
37    }
38}