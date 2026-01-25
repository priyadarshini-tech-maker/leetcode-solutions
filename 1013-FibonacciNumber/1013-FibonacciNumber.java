// Last updated: 1/25/2026, 2:29:26 PM
class Solution {
    public int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}

    