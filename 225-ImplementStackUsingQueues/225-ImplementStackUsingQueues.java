// Last updated: 7/31/2026, 8:28:34 PM
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }

    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < q.size()-1; i++) q.add(q.remove());
        return q.remove();
    }
    
    public int top() {
        for (int i = 0; i < q.size()-1; i++) q.add(q.remove());
        int last =  q.peek();
        q.add(q.remove());
        return last;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
