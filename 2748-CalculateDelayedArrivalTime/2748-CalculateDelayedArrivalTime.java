// Last updated: 1/25/2026, 2:29:01 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
        
    }
}