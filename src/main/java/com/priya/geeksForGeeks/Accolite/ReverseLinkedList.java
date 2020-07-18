package main.java.com.priya.geeksForGeeks.Accolite;

public class ReverseLinkedList extends LinkedListBase {

    public void reverseList() {
        Node node = head.next;
        Node temp;

        while (node.next != null) {
            temp = head.next;
            head.next = node.next;
            node.next = head.next.next;
            head.next.next = temp;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();

        obj.head = new Node(null, null);
        obj.addNode(new Node(1, null));
        obj.addNode(new Node(2, null));
        obj.addNode(new Node(3, null));
        obj.addNode(new Node(4, null));

        System.out.println("normal List");
        obj.printList();
        obj.reverseList();
        System.out.println("After reversing");
        obj.printList();

    }
}
