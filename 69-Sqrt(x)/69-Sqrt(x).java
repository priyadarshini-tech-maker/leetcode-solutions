// Last updated: 1/30/2026, 5:47:49 PM
1class Solution {
2    public int mySqrt(int x) {
3        if(x==0 || x==1) {
4            return x;
5        }
6        int left=1;
7        int right=x;
8        while(left<=right) {
9            int mid=left+(right-left)/2;
10            long square=(long) mid*mid;
11        if(square==x) {
12            return mid;
13        }
14        else if(square<x) {
15            left=mid+1;
16        }
17        else{
18            right=mid-1;
19        }
20        }
21        
22        return right;
23        
24    }
25}