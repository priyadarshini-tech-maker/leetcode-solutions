// Last updated: 2/8/2026, 8:49:29 AM
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        List<Long> stack = new ArrayList<>();
4        for(int num : nums) {
5            long current = num;
6            while(!stack.isEmpty() && stack.get(stack.size() - 1) == current) {
7                current += stack.remove(stack.size() - 1);
8            }
9            stack.add(current);
10        }
11        return stack;
12        
13    }
14}