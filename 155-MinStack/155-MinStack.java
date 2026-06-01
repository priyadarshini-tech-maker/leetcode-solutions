// Last updated: 6/1/2026, 3:39:18 PM
1import java.util.Stack;
2
3class MinStack {
4
5    private Stack<Integer> stack;
6    private Stack<Integer> minStack;
7
8    public MinStack() {
9        stack = new Stack<>();
10        minStack = new Stack<>();
11    }
12    
13    public void push(int val) {
14        stack.push(val);
15
16        if (minStack.isEmpty()) {
17            minStack.push(val);
18        } else {
19            minStack.push(Math.min(val, minStack.peek()));
20        }
21    }
22    
23    public void pop() {
24        stack.pop();
25        minStack.pop();
26    }
27    
28    public int top() {
29        return stack.peek();
30    }
31    
32    public int getMin() {
33        return minStack.peek();
34    }
35}
36/**
37 * Your MinStack object will be instantiated and called as such:
38 * MinStack obj = new MinStack();
39 * obj.push(val);
40 * obj.pop();
41 * int param_3 = obj.top();
42 * int param_4 = obj.getMin();
43 */