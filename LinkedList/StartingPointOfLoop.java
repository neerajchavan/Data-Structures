public class StartingPointOfLoop {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(50);
        node.next.next.next = new Node(5);
        node.next.next.next.next = node.next; 
    }

    public static Node findStartingPointOfLoop(Node head){
        if(head==null || head.next == null || head.next.next == null) return null;

        Node slow = head, fast = head;

        slow = slow.next;
        fast = fast.next.next;

        while(fast != null && fast.next != null){

            if(slow == fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow == fast && fast == head) return head;
        else if(slow == fast){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            
            if(slow.next == fast.next) return slow.next;
        }
        
        return null;
    }
}
