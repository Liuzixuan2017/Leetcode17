/*
    The second stack remembers elements in a reverse order. 
    first stack is for elements pushed into queue
    second stack is for pop and peek
    only when the second stack is empty, we need to push all elements into the second stack.
*/
public class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> current;
    Stack<Integer> alter;
    public MyQueue() {
        current = new Stack<Integer>();
        alter = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        //push to nonempty stack
        current.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (alter.empty() == true) {
           while (current.empty() == false) {
             alter.push(current.pop());
            } 
        } 
        return alter.pop();
    }

    
    /** Get the front element. */
    public int peek() {
        if (alter.empty() == true) {
           while (current.empty() == false) {
             alter.push(current.pop());
            } 
        } 
        return alter.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (alter.empty() == true && current.empty() == true) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */