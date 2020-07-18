package main.java.com.priya.geeksForGeeks.Accolite;

import java.util.HashMap;

public class IdentifyAndCorrectLoopInLinkedList extends LinkedListBase {

    HashMap<Node, Node> visited = new HashMap<>();

    public boolean detectLoop(Node head) {
        Node node = head.next;
        while (node != null) {
            if (visited.containsKey(node))
                return true;
            else
                visited.put(node, node);
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        IdentifyAndCorrectLoopInLinkedList obj = new IdentifyAndCorrectLoopInLinkedList();

        obj.head = new Node(null, null);
        obj.addNode(new Node(1, null));
        obj.addNode(new Node(2, null));
        obj.addNode(new Node(3, null));
        obj.head.next.next.next.next = obj.head;

        System.out.println(obj.detectLoop(obj.head));
    }
}
