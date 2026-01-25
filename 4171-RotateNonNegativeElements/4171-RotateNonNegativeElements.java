// Last updated: 1/25/2026, 2:28:49 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> indices = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=0) {
                indices.add(i);
                values.add(nums[i]);
            }
        }
        int size = values.size();
        if(size == 0) return nums;
        k=k%size;
        Collections.rotate(values, -k);
        for(int i=0;i<size;i++) {
            nums[indices.get(i)] = values.get(i);
        }
        return nums;
        
    }
}