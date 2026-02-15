// Last updated: 2/15/2026, 8:29:57 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        Set<Integer> onBulbs = new HashSet<>();
4        for(int b : bulbs) {
5
6            if (onBulbs.contains(b)) {
7                onBulbs.remove(b);
8            }else{
9                onBulbs.add(b);
10            }
11        }
12        List<Integer> result = new ArrayList<>(onBulbs);
13        Collections.sort(result);
14        return result;
15        
16        
17    }
18}