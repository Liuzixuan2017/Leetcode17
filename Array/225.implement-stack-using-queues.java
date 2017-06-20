// Implement the following operations of a stack using queues.

// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// empty() -- Return whether the stack is empty.


public class MyStack {
    Queue<Integer> current;
    Queue<Integer> Alt;
    /** Initialize your data structure here. */
    public MyStack() {
        current = new ArrayDeque<Integer>();
        Alt = new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if (current.peek() != null) {
           current.add(x); 
        } else {
            Alt.add(x); 
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int last = 0;
       if (current.peek() != null) {
            while(current.peek()!= null) {
                last = current.poll();
                if (current.peek()!= null) {
                     Alt.add(last);
                } 
            }
            return last;
        } else {
           while(Alt.peek()!= null) {
                last = Alt.poll();
                if (Alt.peek() != null) {
                   current.add(last); 
                }
            }
            return last;
        }
    }
    
    /** Get the top element. */
    public int top() {
        int last = 0;
        if (current.peek() != null) {
            while(current.peek()!= null) {
                last = current.poll();
                Alt.add(last);
            }
            return last;
        } else {
           while(Alt.peek()!= null) {
                last = Alt.poll();
                current.add(last);
            }
            return last;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (current.peek() == null && Alt.peek() == null) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */