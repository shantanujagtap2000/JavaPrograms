package codingQue;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printMiddle() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        if (slowPointer != null) {
            System.out.println("The middle element is: " + slowPointer.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}

public class PrintMiddale {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Example: Adding elements to the linked list
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);

        // Finding and printing the middle element
        linkedList.printMiddle();
    }
}
