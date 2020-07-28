package main.java.com.priya.geeksForGeeks.Accolite;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
public class DeleteLinkedListNode extends LinkedListBase {

    public void deleteNode(int val) {
        Node prev = head;
        Node node = head.next;
        while (node.data != val && node != null) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
    }

    public static void main(String[] args) {
        DeleteLinkedListNode obj = new DeleteLinkedListNode();

        obj.head = new LinkedListBase.Node(null, null);
        obj.addNode(new LinkedListBase.Node(1, null));
        obj.addNode(new LinkedListBase.Node(2, null));
        obj.addNode(new LinkedListBase.Node(3, null));
        obj.addNode(new LinkedListBase.Node(4, null));

        System.out.println("Before");
        obj.printList();
        System.out.println("After");
        obj.deleteNode(4);
        obj.printList();
    }
}
