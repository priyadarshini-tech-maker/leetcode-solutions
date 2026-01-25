// Last updated: 1/25/2026, 2:29:32 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // avoid adding square root twice
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}

