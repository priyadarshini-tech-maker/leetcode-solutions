// Last updated: 6/4/2026, 3:46:45 PM
1class Solution {
2    public int fib(int n) {
3        if(n<=1) {
4            return n;
5
6        }
7        return fib(n-1) + fib(n-2);
8        
9    }
10}