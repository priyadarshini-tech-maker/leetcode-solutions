// Last updated: 1/25/2026, 2:29:07 PM
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int x = (int)Math.sqrt(total);
        return x * x == total ? x : -1;
    }
}
