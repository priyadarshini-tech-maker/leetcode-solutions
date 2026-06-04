// Last updated: 6/4/2026, 1:51:37 PM
1class Solution {
2    public int[][] merge(int[][] inp) {
3        Arrays.sort(inp,(a,b)->Integer.compare(a[0],b[0]));
4        int k=0;
5        for(int i=1;i<inp.length;i++){
6            if(inp[k][1]>=inp[i][0]){
7                inp[k][1]=Math.max(inp[i][1],inp[k][1]);
8            }else{
9                k++;
10                inp[k]=inp[i];
11            }
12        }
13        return Arrays.copyOfRange(inp,0,k+1);
14        
15    }
16}