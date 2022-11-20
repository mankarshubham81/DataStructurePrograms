import java.util.Stack;
// import javax.xml.crypto.Data;

// Stack (Last In First Out)
// push()
// pop()
// peek()

// Number of ways to implement a Stack
// Array (bad way)
// ArrayList (good way)
// Linked List (good way)

/**
 * MyStack
 */
public class MyStack {

    // public static int len = 0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head = null;
    public static boolean isEmpty(){
        return head == null;
    }

    public static void push(int num) {
        Node newNode = new Node(num);
        if(isEmpty()){
            head = newNode;
            // this.len++;
            return;
        }

        newNode.next = head;
        head = newNode;
        // this.len++;
    }
    
    public static int pop() {

        if(isEmpty()){
            return -1;
        }
        int popped = head.data;
        head = head.next;

        return popped;
        
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    // public static void display(){

    //     for (int i = 0; i < this.len; i++) {
            
    //     }
    // }

    public static void main(String[] args) {

        MyStack s = new MyStack();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());



    }
}
