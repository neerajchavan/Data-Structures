public class DeleteSortedDuplicates {
    public static void main(String[] args) {
        Node node = new Node(2);
	        node.next = new Node(2);
	        node.next.next = new Node(3);
	        node.next.next.next = new Node(3);
            node.next.next.next.next = new Node(4);

            Node.printLinkedList(removeDuplicatesInSortedLL(node));
    }

    public static Node removeDuplicatesInSortedLL(Node head){
        
        Node curr = head;

        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val)
              curr.next = curr.next.next;
            else
             curr = curr.next; 
        }

        return head;
    }
}
