// Last updated: 1/25/2026, 2:29:30 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
       int x=(n^(n>>1));
       return (x&(x+1))==0?true:false;
    }
}