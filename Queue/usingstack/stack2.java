package Queue.usingstack;
import java.util.*;
public class stack2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            if(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }

        
    }
    public static void main(String args[]){

    }
    
}
