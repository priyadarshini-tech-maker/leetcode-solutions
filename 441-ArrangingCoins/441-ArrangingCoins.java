// Last updated: 1/25/2026, 2:29:37 PM
class Solution {
    public int arrangeCoins(int n) {
        long k = (long)(Math.sqrt(1 + 8.0 * n) - 1) / 2;
        return (int) k;
    }
}

