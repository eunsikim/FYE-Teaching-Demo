public class LinkedList {
    node head;

    public LinkedList() {
        this.head = null;
    }

    // Addition operations
    // Add a node to the front of the list
    public void addFront(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add a node to the end of the list
    public void addEnd(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        for (node current = head; current != null; current = current.next) {
            if (current.next == null) {
                current.next = newNode;
                return;
            }
        }
    }

    // Add a node based on a given index
    public void addIndex(int data, int index) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        int i = 0;
        for (node current = head; current != null; current = current.next) {
            if (i == index - 1) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            i++;
        }
    }

    // Deletion operations
    // Delete the first node with the given data
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        for (node current = head; current != null; current = current.next) {
            if (current.next != null && current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }

    // Print the list
    public void print() {
        for (node current = head; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }
}
