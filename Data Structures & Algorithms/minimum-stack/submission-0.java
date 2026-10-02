class MinStack {

        Node head = new Node(-1);
        Node top = null;
    public MinStack() {
    }
    
    public void push(int val) {
        if(top == null){
            head.next = new Node(val,val);
            top = head.next;
            top.prev = head;
        }
        else{
            top.next = new Node(val,Math.min(val,top.min),top);
            top = top.next;
        }
    }
    
    public void pop() {
        if(top == null) return;
        if(top == head.next){
            head.next = null;
            top = null;
            return;
        }
        top = top.prev;
        top.next = null;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
}
class Node{

    int val;
    int min;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
    Node(int val,int min){
        this.val = val;
        this.min = min;
    }
    Node(int val,int min,Node prev){
        this.val = val;
        this.min = min;
        this.prev = prev;
    }
}
