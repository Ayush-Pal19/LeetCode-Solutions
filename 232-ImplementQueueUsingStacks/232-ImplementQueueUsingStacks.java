// Last updated: 7/31/2026, 8:28:32 PM
class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
        
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if (helper.isEmpty()) {
            while (!st.isEmpty()) helper.push(st.pop());
        }
        return helper.pop();
    }

    public int peek() {
        if (helper.isEmpty()) {
            while (!st.isEmpty()) helper.push(st.pop());
        }
        return helper.peek();
    }

    public boolean empty() {
        return st.isEmpty() && helper.isEmpty();
    }
}
