// Last updated: 2/8/2026, 8:40:29 AM
1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        int n = nums.length;
4        Deque<Integer> maxDeque = new ArrayDeque<>();
5        Deque<Integer> minDeque = new ArrayDeque<>();
6        long ans = 0;
7        int left = 0;
8        for(int right = 0; right<n; right++) {
9            while(!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
10                maxDeque.pollLast();
11            }
12            maxDeque.addLast(right);
13
14            while(!minDeque.isEmpty() && nums [minDeque.peekLast()] >= nums[right]) {
15                minDeque.pollLast();
16            }
17            minDeque.addLast(right);
18            while(!maxDeque.isEmpty() && !minDeque.isEmpty()) {
19                long maxVal = nums[maxDeque.peekFirst()];
20                long minVal = nums[minDeque.peekFirst()];
21                long len = right - left + 1;
22                if((maxVal - minVal) * len <= k) break;
23                if(maxDeque.peekFirst() == left) maxDeque.pollFirst();
24                if(minDeque.peekFirst() == left) minDeque.pollFirst();
25                left++;
26                
27            }
28            ans += (right - left + 1);
29            
30        }
31        return ans;
32        
33    }
34}