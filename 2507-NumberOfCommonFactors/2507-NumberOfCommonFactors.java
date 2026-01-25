// Last updated: 1/25/2026, 2:29:10 PM
class Solution {
    public int commonFactors(int a, int b) {
        int g = gcd(a, b), count = 0;
        for (int i = 1; i <= g; i++) if (g % i == 0) count++;
        return count;
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
;