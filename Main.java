import java.util.*;
class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next= null;
        }
}
class LL{
    Node head=null;
    //add first
    public void addFirst(String data){
        Node newNode= new Node(data);
     if (head==null){
        head = newNode;
        return;
     }
     newNode.next=head;
     head= newNode;
    }
    // add last
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
    }
    Node currNode= head;
    while(currNode.next !=null){
        currNode= currNode.next;
    }
    currNode.next= newNode;
    }
    // print list
    public void printList(){
        if (head==null){
            System.out.print("lsit is empty");
            return;
        }
    Node currNode= head;
    while(currNode !=null){
        System.out.print(currNode.data + "->");
        currNode= currNode.next;
    }
     System.out.println("null");
    }
    
}
class Main {
    public static void main(String [] args){
        LL list = new LL();
       
        list.addLast("list");
        list.addFirst("this");
        

        list.printList();
    }
}

