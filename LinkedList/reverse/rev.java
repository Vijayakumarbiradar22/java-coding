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
        size--;
        head=head.next;
    }

    //removeLast
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //printList
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
             System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    


    public static void main(String args[]){
        rev list=new rev();
        list.addFirst("10");
        list.addLast("20");
        list.addLast("30");
        list.addLast("40");

        list.printList();

        // list.removeLast();
        // list.printList();

        // list.removeFirst();
        // list.printList();
        
        // int totalsize=list.getSize();
        // System.out.println(totalsize);


    }
    
    
}
