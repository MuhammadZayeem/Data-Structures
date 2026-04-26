public class main {
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        d.InsertAtFirst(2);
        d.InsertAtFirst(1);
        d.InsertAtIndex(2,3);
        d.InsertAtLast(4);
        d.display();
        d.DeleteFromIndex(3);
        d.DeleteFromEnd();
        d.DeleteFromStart();
        d.display();
    }
}
