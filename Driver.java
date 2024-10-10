public class Driver {
    public static void main(String[] args) {
        // Create a new (empty) Linked List
        LinkedList list = new LinkedList();

        // Add data (integers) into the front of the linked list
        list.addFront(3);
        list.addFront(2);
        list.addFront(1);
        list.addEnd(0);

        list.print(); // Outputs 1 2 3 0

        list.delete(3);

        list.print(); // Outputs 1 2 0
    }
}
