// Last updated: 1/25/2026, 2:29:45 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) {
            return false;
    }
        return (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}
