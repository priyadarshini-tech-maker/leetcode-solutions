// Last updated: 1/25/2026, 2:28:54 PM
class Solution {
    public int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(num-> num %3 != 0).count();
        
    }
}