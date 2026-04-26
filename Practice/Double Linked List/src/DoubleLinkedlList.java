public class DoubleLinkedlList {
    public Node head;
    public Node tail;
    public int size;

    public DoubleLinkedlList(){
        size = 0;
    }

    // -------------------- INSERT AT START
    public void InsertAtStart(int value){
        Node node = new Node(value);

        if(head == null){
            head = tail = node;
        } else {
            node.nextaddress = head;
            head.previousaddress = node;
            head = node;
        }
        size++;
    }

    // -------------------- INSERT AT END
    public void InsertAtLast(int value){
        Node node = new Node(value);

        if(tail == null){
            InsertAtStart(value);
            return;
        }

        tail.nextaddress = node;
        node.previousaddress = tail;
        tail = node;

        size++;
    }

    // -------------------- INSERT AT INDEX
    public void InsertAtIndex(int index, int value){
        if(index == 0){
            InsertAtStart(value);
            return;
        }
        if(index == size){
            InsertAtLast(value);
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.nextaddress;
        }

        Node node = new Node(value);

        node.nextaddress = temp.nextaddress;
        node.previousaddress = temp;

        temp.nextaddress.previousaddress = node;
        temp.nextaddress = node;

        size++;
    }

    // -------------------- DELETE FROM START
    public void DeleteFromStart(){
        if(head == null){
            System.out.println("List Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        } else {
            head = head.nextaddress;
            head.previousaddress = null;
        }
        size--;
    }

    // -------------------- DELETE FROM END
    public void DeleteFromEnd(){
        if(tail == null){
            System.out.println("List Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.previousaddress;
            tail.nextaddress = null;
        }
        size--;
    }

    // -------------------- DISPLAY FORWARD
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print("[" + temp.value + "] <-> ");
            temp = temp.nextaddress;
        }
        System.out.println("NULL");
    }

    // -------------------- DISPLAY REVERSE (ADVANTAGE 🔥)
    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print("[" + temp.value + "] <-> ");
            temp = temp.previousaddress;
        }
        System.out.println("NULL");
    }
}