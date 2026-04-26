public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.size=0;
    }
    //-----------------------------------------------Insertion
    public void InsertAtStart(int value){
        Node node=new Node(value);
        node.nextaddress=head;
        head=node;
        size++;
        if(tail==null){
            tail=head;
        }
    }

    public void InsertAtLast(int value){
        Node node=new Node(value);
        if(tail==null){
            InsertAtStart(value);
            return;
        }

        tail.nextaddress = node;
        tail = node;
        size++;

    }
    public void InsertAtIndex(int index,int value) {
        if (head == null) {
            InsertAtStart(value);
            return;
        }
        if (index == size) {
            InsertAtLast(value);
            return;
        }
        Node temp = head;
        int count = 0;
        while (count != index-1) {
            temp = temp.nextaddress;
            count++;
        }
        Node node = new Node(temp.nextaddress, value);
        temp.nextaddress = node;
        size++;
    }
    //----------------------------------------------------------------Deletion
    public int DeleteFromStart() {
        if (head == null) {
            System.out.println("List is Already Empty...");
            return -1;
        }
        int temp = head.value;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.nextaddress;
        }
        size--;
        return temp;
    }
    public void DeleteFromEnd(){
        if(head==null){
            System.out.println("List is Already Empty...");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        Node temp=head;
        while((temp.nextaddress).nextaddress!=null){
            temp=temp.nextaddress;
        }
        temp.nextaddress=null;
        tail=temp;
        size--;
    }
    public void DeleteFromIndex(int index){
        if(head==null){
            System.out.println("List is Already Empty...");
            return;
        }
        if(index==0){
            DeleteFromStart();
            return;
        }
        if(index==size-1){
            DeleteFromEnd();
            return;
        }
        Node temp=head;
        int count=0;
        while(count!=index-1){
            temp=temp.nextaddress;
            count++;
        }
        temp.nextaddress=(temp.nextaddress).nextaddress;
        size--;
    }
    //------------------------------------------------------------Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println("["+temp.value+"]");
            System.out.println("^");
            System.out.println("|");
            temp=temp.nextaddress;
        }
        //System.out.println("List Finished...");
    }

    //-------------------------------------------------------------For Peek Method
    public void displayLast(){
        System.out.println("The Peek Value is "+head.value);
    }
//---------------------------------------------------------for queue display
public void displayqueue(){
    Node temp=head;
    System.out.print("Front-");
    while(temp!=null){
        System.out.print("["+temp.value+"]->");
        temp=temp.nextaddress;
    }
    System.out.print("-Back");
}
}


