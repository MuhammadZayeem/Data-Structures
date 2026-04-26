public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList(){
        this.size=0;
    }

    public void InsertAtFirst(int value){
        Node node=new Node(value);
        node.nextaddress=head;
        node.previousaddress=null;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void InsertAtLast(int value){
        Node node=new Node(value);
        if(tail==null){
            InsertAtFirst(value);
            return;
        }
        tail.nextaddress=node;
        node.previousaddress=tail;
        tail=node;
        size++;
    }
    public void InsertAtIndex(int index,int value){
        if(index==0){
            InsertAtFirst(value);
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
        Node node=new Node(temp.nextaddress,temp,value);
        temp.nextaddress=node;
        temp.nextaddress.previousaddress = node;
        size++;
    }
    public void DeleteFromStart(){
        if(head==null) {
            System.out.println("Empty list....");
            return;
        }
        if(head==tail){
          head=tail=null;
          return;
        }
        head=head.nextaddress;
        head.previousaddress=null;
        size--;
        }
        public void DeleteFromEnd(){
            if(tail==null) {
                System.out.println("Empty list....");
                return;
            }
            if(head==tail){
                head=tail=null;
                return;
            }
            tail=tail.previousaddress;
            tail.nextaddress=null;
    }
    public void DeleteFromIndex(int index){
        if(head==null){
            System.out.println("There is nothing to delete...");
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
            temp.nextaddress.previousaddress=temp;
            size--;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print("["+temp.value+"]-><-");
            temp=temp.nextaddress;
        }
    }
    public void reversedOrder(){
        Node temp=tail;
        while(temp!=null){
            System.out.print("["+temp.value+"]->");
            temp=temp.previousaddress;
        }
    }


}
