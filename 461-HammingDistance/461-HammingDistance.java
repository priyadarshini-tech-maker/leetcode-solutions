// Last updated: 1/25/2026, 2:29:36 PM
class Solution {
    public int hammingDistance(int x, int y) {
        
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }
}