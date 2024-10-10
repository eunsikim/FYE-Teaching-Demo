public class Driver {
    public static void main(String[] args) {
        // Create a new (empty) Linked List
        LinkedList list = new LinkedList();

        // Add data (integers) into the front of the linked list
        list.addFront(3); // LinkedList: 3
        list.addFront(2); // LinkedList: 2 3
        list.addFront(1); // LinkedList: 1 2 3
        list.addEnd(0); // LinkedList: 1 2 3 0

        list.print(); // Outputs 1 2 3 0

        list.delete(3);

        list.print(); // Outputs 1 2 0
    }
}
