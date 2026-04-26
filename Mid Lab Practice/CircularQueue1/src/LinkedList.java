public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.size=0;
    }
    public void InsertAtStart(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = head = node;
            tail.nextaddress = head;
        } else {
            node.nextaddress = head;
            head = node;
            tail.nextaddress = head;
        }
        size++;
    }

    public void InsertAtLast(int value){
        if(tail==null){
            InsertAtStart(value);
            return;
        }
        Node node=new Node(value);
        tail.nextaddress=node;
        tail=node;
        tail.nextaddress=head;
        size++;
    }
    public void InsertAtIndex(int index,int value){
        if(index==0){
            InsertAtStart(value);
            return;
        }
        if(index==size){
            InsertAtLast(value);
            return;
        }
        Node temp=head;
        int count=0;
        while(count!=index-1){
            temp=temp.nextaddress;
            count++;
        }
        Node node=new Node(temp.nextaddress,value);
        temp.nextaddress=node;
        size++;
    }

    public Node DeleteFromStart(){
        if(head==null){
            System.out.println("List is Empty...");
            return null;
        }
        if(head==tail){
            Node e=head;
            head=tail=null;
            size--;
            return e;
        }
        Node d=head;
         head=head.nextaddress;
        tail.nextaddress=head;
        size--;
        return d;
    }
    public void DeleteFromEnd(){
        if(head==null){
            System.out.println("List is Empty...");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        Node temp=head;
        while(temp.nextaddress!=tail){
            temp=temp.nextaddress;
        }
        temp.nextaddress=head;
        tail=temp;
        size--;
    }
    public void DeleteFromIndex(int index){
        if(head==null){
            System.out.println("List is Empty...");
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
        public void display(){
            if (head == null) {
                System.out.println("Front--Back (List is Empty)");
                return;
            }
        Node temp=head;
            System.out.print("Front-");
            do {
                System.out.print("["+temp.value+"]->");
                temp=temp.nextaddress;
            }while(temp!=head);
            System.out.print("-Back");
    }
}
