// Last updated: 1/25/2026, 2:29:20 PM
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }
}
