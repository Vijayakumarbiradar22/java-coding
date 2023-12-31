package Queue.usinglinkedlist;
//import java.util.*;
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

    public static boolean isEmpty(){
        return head==null & tail==null;
    }

    //enqueue
    public static void add(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //dequeue
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        int front = head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
        return front;
    }
    public static void main(String args[]){

    }
    
}
