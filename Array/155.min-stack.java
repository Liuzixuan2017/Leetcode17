// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// getMin() -- Retrieve the minimum element in the stack.
public class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int x) {
        s.push(x);
        if (min.empty()) {
            min.push(x);
        } else {
            int p = min.peek();//it should be peek istead of pop
            if (p >= x) {
                min.push(x);
            }
        }
    }
    
    public void pop() {
        int p = s.pop();
        int pe = min.peek();
        if (p == pe) {
            min.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
/*
when pop an element from stack we have to consider the smallest element in the stack
*/
/*using two stacks the first one is just the normal stack, 
the second stack is only be pushed when the x is smaller than 
the top element. */
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */