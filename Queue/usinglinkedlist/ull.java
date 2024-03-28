package Queue.usinglinkedlist;
public class ull {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static Node head=null;
    static Node tail=null;

    public boolean isEmpty(){
        return head==null & tail==null;
    }

    //enqueue
    public void add(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //dequeue
    public int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }

        int front = head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
        return front;
    }

    //peak
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return head.data;
    }
    public static void main(String args[]){
        ull q = new ull();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
