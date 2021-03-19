import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteLoop {
  public static void main(String[] args) {
    Node node = new Node(10);
    node.next = new Node(2);
    node.next.next = new Node(2);
    node.next.next.next = new Node(4);
    node.next.next.next.next = node.next;

    // Calling deleteLoop() implemented using map
    // if(deleteLoop(node)){
    // Node.printLinkedList(node);
    // }

    detectAndDeleteLoop(node);
    Node.printLinkedList(node);
  }

  // Delete loop using map
  public static boolean deleteLoop(Node node) {
    Set<Node> set = new LinkedHashSet<>();
    Node prev = null;
    while (node != null) {
      if (set.contains(node)) {
        prev.next = null;
        return true;
      } else {
        set.add(node);
        prev = node;
        node = node.next;
      }
    }

    return false;
  }

  // Delete loop without using map
  public static void detectAndDeleteLoop(Node node) {

    if (node == null || node.next == null || node.next.next == null)
      return;

    Node slow = node.next;
    Node fast = node.next.next;
    Node prev = null;

    while (fast != null && fast.next != null) {

      if (slow == fast)
        break;

      prev = slow;
      slow = slow.next;
      fast = fast.next.next;

    }

    if (slow == fast && fast == node) {
      prev.next = null;
    }

    else if (slow == fast) {
      slow = node;
      while (slow.next != fast.next) {
        slow = slow.next;
        fast = fast.next;
      }

      fast.next = null;
    }
  }
}
