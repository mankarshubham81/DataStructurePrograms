// Top Main Operations
// 1 Insert/add 2 print 3 delete 4  

public class LinkListClass {
    
    private Node head = null;
    private Node tail = null;
    
    private int size;
    
    public LinkListClass(){
        this.size = 0;
    }

    class Node {
        
        private String data;
        private Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

        Node(String dtat, Node next){
            this.data = data;
            this.next = next;
        }
    }

    // Add / Insert Operation
    public void insertFirst(String data){
        Node newNode = new Node(data);
        
        // if(head == null){
        //     head = newNode;
        //     return; 
        // }

        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }

        size +=1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(String data){
        if(tail == null){
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        tail.next  = newNode;
        tail = newNode;

        size += 1;

    }

    public void insert(String data, int index){
        if(index == 0){
            insertFirst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // Node newNode = new Node(data, temp.next);
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size += 1;
    }

    public String deleteFirst(){
        Node temp = head;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -=1;
        return temp.data;
    }

    public String deleteLast(){
         
    }

    public static void main(String[] args) {
      LinkListClass list = new LinkListClass();  
        list.insertFirst("3");
        list.insertFirst("2");
        list.insertFirst("1");
        list.insertLast("4");
        list.insertLast("5");
        list.insert("data", 1);
        list.insert("33", 2);
        System.out.println(list.size);
        list.display();
        System.out.println("deleted ele : "+list.deleteFirst());
        list.display();
        System.out.println(list.size);
        
    }


}
