import java.util.Scanner;

public class Insertion_sort_SLL {

    static class Node {
        int data;
        Node next;
        Node (int d){
            this.data = d;
            this.next = null;

        }
    }
   static Node head = null;
    static Node tail = null;
    public static void addNode(int value){
        Node newNode = new Node(value);
        if ( head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public static  void display(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Nodes:");
        int len = in.nextInt();
        for( int i =0; i < len ; i++){
            addNode(in.nextInt());
        }
        System.out.println("Before Insertion Sort");
        display(head);
        System.out.println("\nAfter Insertion Sort");
        Node t = insertionSort(head);
        display(t);

    }
    public static  Node insertionSort(Node head){
        Node dummy = new Node(-1);
        while (head != null){
            Node next = head.next;
            Node temp = dummy;
            while (temp.next != null && temp.next.data < head.data){
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        return dummy.next;
    }
}
