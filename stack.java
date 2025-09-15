class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackB {
    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        return head.data;
    }
}

public class stack {

    public static void main(String[] args) {
        StackB s = new StackB();
        s.push(1);
        s.push(2);

        System.out.println(s.peek());

    }

}
