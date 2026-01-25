// Last updated: 1/25/2026, 2:29:11 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> map = new HashMap<>();
        long res = 0;
        
        for (int[] rect : rectangles) {
            int w = rect[0], h = rect[1];
            int g = gcd(w, h);
            String ratio = (w / g) + "/" + (h / g);  
            
            long count = map.getOrDefault(ratio, 0L);
            res += count;  
            map.put(ratio, count + 1);
        }
        
        return res;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

