// Last updated: 1/25/2026, 2:29:53 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}

        
