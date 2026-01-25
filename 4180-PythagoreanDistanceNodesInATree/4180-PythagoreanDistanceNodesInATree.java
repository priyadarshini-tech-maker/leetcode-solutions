// Last updated: 1/25/2026, 2:28:50 PM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        int[] dx=bfs(graph, n, x);
        int[] dy=bfs(graph, n, y);
        int[] dz=bfs(graph, n, z);
        int count = 0;
        for(int i=0;i<n;i++) {
            int[] arr = {dx[i], dy[i], dz[i]};
            Arrays.sort(arr);
            int a = arr[0], b =arr[1], c = arr[2];
            if(a*a+b*b==c*c) {
                count++;
            }
        }
        return count;
        
    }
    private int[] bfs(List<List<Integer>> graph, int n, int start) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dist[start] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for(int v:graph.get(u)) {
                if(dist[v]==-1) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }
        return dist;
    }
}