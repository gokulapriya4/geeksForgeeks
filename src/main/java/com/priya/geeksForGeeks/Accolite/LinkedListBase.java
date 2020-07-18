package main.java.com.priya.geeksForGeeks.Accolite;

public class LinkedListBase {
    Node head;

    static class Node {
        Integer data;
        Node next;

        Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void addNode(Node nextNode) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = nextNode;
    }

    void printList() {
        Node node = head.next;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

}
