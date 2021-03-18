public class DetectLoop {

	public static void main(String[] args) {
		 	Node node = new Node(1);
	        node.next = new Node(2);
	        node.next.next = new Node(2);
	        node.next.next.next = new Node(4);
            node.next.next.next.next = node.next;  
            
            System.out.println(detectLoopInLinkedList(node)); 
	}
	
	public static boolean detectLoopInLinkedList(Node node) {
		if(node == null || node.next==null)	return false;
		
		Node slow = node;
		Node fast = node;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) return true;
		}
		
		return false;	
	}
	
}
