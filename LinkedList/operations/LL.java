package LinkedList.operations;

public class LL {
    Node head;
    private int size;

    LL(){
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
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //deleteLast
    public void deleteLast(){
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

    //print output
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
             System.out.print(currNode.data+"->");
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("10");
        list.addLast("20");
        list.addLast("30");
        list.addLast("40");

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        int totalSize=list.getSize();
        System.out.println(totalSize);


    }
    
}
