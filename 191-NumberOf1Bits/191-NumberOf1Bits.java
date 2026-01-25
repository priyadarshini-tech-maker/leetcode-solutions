// Last updated: 1/25/2026, 2:29:54 PM
class Solution {
    public int hammingWeight(int n) {
            int count=0;
            while(n!=0) {
            count += (n & 1);  
            n >>>= 1;          
        }
        return count;
    }
}

    