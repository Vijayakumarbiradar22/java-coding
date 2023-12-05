package LinkedList.reverse;

public class rev {
    Node head;
    private int size;

    rev(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //addLast
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //deleteFirst
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    //removeLast
    
    
}
