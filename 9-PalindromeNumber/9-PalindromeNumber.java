// Last updated: 1/25/2026, 2:30:21 PM
class Solution {
    public boolean isPalindrome(int x) {
        return x >= 0 && new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}

    