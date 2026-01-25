// Last updated: 1/25/2026, 2:29:25 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight =-1;
        
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            if (temp > maxRight) {
                maxRight = temp;
            }
        }
        
        return arr;
    }
}