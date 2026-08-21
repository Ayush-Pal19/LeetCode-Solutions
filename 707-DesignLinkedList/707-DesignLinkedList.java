// Last updated: 7/31/2026, 8:28:17 PM
class Node {
    int val;
    Node next;
    Node() {
        this.val = 0;
        this.next = null;
    }
    Node(int val) {
        this.val = val;
        this.next = null;
    }
    Node(Node next) {
        this.val = 0;
        this.next = next;
    }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
class MyLinkedList {
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {temp = temp.next;}
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (size==0) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (size==0) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index<=0) {
            addAtHead(val);
            return;
        }
        if (index==size) {
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < index-1; i++) {temp = temp.next;}
        Node n = temp.next;
        temp.next = newNode;
        newNode.next = n;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;
        if (index==0) {
            head = head.next;
            size--;
            if (size==0) tail = null;
            return;
        }
        if (index==size-1) {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {temp = temp.next;}
            temp.next = null;
            tail = temp;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {temp = temp.next;}
        temp.next = temp.next.next;
        size--;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */