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
    
    public static void main(String args[]){

    }
    
}
