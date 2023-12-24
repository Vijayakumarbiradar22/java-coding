package Stack.usinglinkedlist;
import java.util.*;
public class ULL {
    public static void main(String args[]){
      static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
      }  

      static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            
        }
      }
    }
    
}
