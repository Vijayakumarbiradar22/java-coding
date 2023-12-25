package Queue.usingarray;
//import java.util.*;
public class que {
    static int arr[];
    static int size;
    static int rear=-1;

    que(int n){
        arr=new int[n];
        this.size=n;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    public static void add (int data){
      if(rear==size-1){
        System.out.println("Queue is full");
        return;
      }
      rear++;
      arr[rear]=data;  
    }

    

    public static void main(String args[]){

    }
    
}
