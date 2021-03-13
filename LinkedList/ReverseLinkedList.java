
//Definition for singly-linked list.
class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(50);
        node.next.next.next = new Node(5);

        System.out.println("\nLinked List Before Reversal : ");
        printLinkedList(node);

        System.out.println("\nAfter Reversal By Iteration: ");
        printLinkedList(reverseLinkedListByIeration(node));
        
        // System.out.println("\nAfter Reversal By Recursion: ");
        // printLinkedList(reverseLinkedListByRecursion(node));

    }

    public static void printLinkedList(Node node){
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    // Linked List Reversal Using Iteration
    public static Node reverseLinkedListByIeration(Node node){
        Node current = node;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Linked List Reversal Using Recursion
    public static Node reverseLinkedListByRecursion(Node node){
        if(node == null || node.next == null){
            return node;
        }

        Node head = reverseLinkedListByRecursion(node.next);
        node.next.next = node;
        node.next = null;


        return head;
    }
}
