// Last updated: 1/25/2026, 2:29:04 PM
class Solution {
    public int passThePillow(int n, int time) {
        return time % (2 * (n - 1)) < n ? time % (2 * (n - 1)) + 1 : n - (time % (2 * (n - 1)) - (n - 1));
    }
}