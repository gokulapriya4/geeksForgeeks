package main.java.com.priya.geeksForGeeks.Accolite;

import java.util.HashMap;

public class IdentifyAndCorrectLoopInLinkedList extends LinkedListBase {

    HashMap<Node, Node> visited = new HashMap<>();

    public void detectLoopAndCorrect(Node head) {
        Node node = head;
        boolean loopFound = false;

        while (node.next != null) {
            if (visited.containsKey(node.next)) {
                loopFound = true;
                break;
            } else {
                visited.put(node, node);
            }
            node = node.next;
        }
        if (loopFound)
            node.next = null;
    }

    public static void main(String[] args) {
        IdentifyAndCorrectLoopInLinkedList obj = new IdentifyAndCorrectLoopInLinkedList();

        obj.head = new Node(null, null);
        obj.addNode(new Node(1, null));
        obj.addNode(new Node(2, null));
        obj.addNode(new Node(3, null));
        obj.head.next.next.next.next = obj.head;

        obj.detectLoopAndCorrect(obj.head);
        obj.printList();
    }
}
