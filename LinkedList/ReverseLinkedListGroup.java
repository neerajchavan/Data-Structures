
public class ReverseLinkedListGroup {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = new Node(8);

        printLinkedList(node);
        System.out.println();
        printLinkedList(reverseLinkedListInGroup(node, 3));
        // printLinkedList(reverseLinkedListInGroup(node,4));
    }

    public static void printLinkedList(Node node){
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public static Node reverseLinkedListInGroup(Node node, int k){
        Node current = node;
        Node prev = null;
        Node next = null;
        int i=1;

        while(current != null && i<=k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }

        if(next != null){
            node.next = reverseLinkedListInGroup(current, k);
        }

        return prev;
    }

}
