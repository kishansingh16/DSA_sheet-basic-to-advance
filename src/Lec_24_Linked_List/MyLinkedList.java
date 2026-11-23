package Lec_24_Linked_List;


class Node{
    int val;
    Node next;

    public Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class MyLinkedList {
    Node head;
    int size=0;

    MyLinkedList(){
        head=null;
        size=0;
    }

    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addaToTail(int val){
        Node newNode=new Node(val);
        Node current=head;
        if(current==null){
           head=newNode;
            size++;
            return ;
        }

        while(current.next!=null){
            current=current.next;
        }

        current.next=newNode;
    }

    public void display(){
        Node current=head;

        while(current!=null){
            System.out.print(current.val +" ->");
            current=current.next;
        }
        System.out.println("null");
    }

    public  static void main(String[] args){
        MyLinkedList list= new MyLinkedList();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(40);
        System.out.println("adding at head ");
        list.display();
        System.out.println("adding at Tail ");
        list.addaToTail(100);
        list.display();

    }
}



