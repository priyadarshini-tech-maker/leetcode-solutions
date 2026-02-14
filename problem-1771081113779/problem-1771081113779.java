// Last updated: 2/14/2026, 8:28:33 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder result = new StringBuilder();
4        for(String word:words) {
5            int sum=0;
6
7            for(char ch : word.toCharArray()) {
8                sum += weights[ch - 'a'];
9            }
10            int modValue = sum% 26;
11            char mappedChar = (char)('z'- modValue);
12            result.append(mappedChar);
13        }
14        return result.toString();
15        
16    }
17}