public class LinkedlList {
    public Node head;
    public Node tail;
    public int size;

    public LinkedlList() {
        this.size = 0;
    }
//------------------------------------------------------------------------Insertion
    public void InsertAtStart(int value){
        Node node=new Node(value);
        node.nextaddress=head;
        head=node;
        if(tail==null){
            tail=head;
        }
            size++;
    }
    public void InsertAtLast(int value){
        //Using Tail Pointer
//        Node node=new Node(value);
//        tail.nextaddress=node;
//        tail=node;
//        if(tail==null){
//            InsertAtStart(value);
//        }
//        size++;
        //Without Using Tail Pointer
        Node node=new Node(value);
        if (head==null){
            head=node;
            return;
        }
        Node temp=head;
        while (temp.nextaddress!=null){
            temp=temp.nextaddress;
        }
        temp.nextaddress=node;
        size++;
    }
    public void InsertAtIndex(int value,int index){
        if(head==null){
            InsertAtStart(value);
            return;
        }
        if(index==size){
            InsertAtLast(value);
            return;
        }
        Node temp=head;
        int count=0;
        while (count!=index){
            temp=temp.nextaddress;
            count++;
        }
        Node node=new Node(temp.nextaddress,value);
        temp.nextaddress=node;
        size++;
    }
//----------------------------------------------------------------------Deletion
    public void DeleteFromStart(){
        if(head==null){
            System.out.println("There is nothing to delete...");
            return;
        }
        head=head.nextaddress;
        size=size-1;
    }
    public void DeleteFromEnd(){
        if(head==null){
            System.out.println("There is nothing to delete...");
            return;
        }
        Node temp=head;
        while ((temp.nextaddress).nextaddress!=null){
            temp=temp.nextaddress;
        }
        temp.nextaddress=null;
        size--;
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
        size--;

    }
//----------------------------------------------------------------------Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print("["+temp.value+"]->");
            temp=temp.nextaddress;
        }
        System.out.println("List Finished");
    }
    public void ReverseDisplay(){
        Node temp=head;
        int arr[]=new int[size];
        int i=0;
        while (temp!=null){
            arr[i]=temp.value;
            temp=temp.nextaddress;
            i++;
        }
        for(int j=size-1;j>=0;j--){
            System.out.print("["+arr[j]+"]->");
        }
    }
    //----------------------------------------------------------------------Merging Linked Lists
    public static LinkedlList MergeLists(LinkedlList list1,LinkedlList list2){
        LinkedlList Merged=new LinkedlList();

        Node temp =list1.head;
        while (temp !=null){
            Merged.InsertAtLast(temp.value);
            temp = temp.nextaddress;
        }
         temp=list2.head;
        while (temp!=null){
            Merged.InsertAtLast(temp.value);
            temp=temp.nextaddress;
        }
        return Merged;
    }

//----------------------------------------------------------------------Searching Methods

//    public void multipleOcuurence(int val){
//        Node temp=head;
//
//    }
    public void search(int val){
        Node temp=head;
        int index=0;
        while (temp!=null){
            if(val==temp.value){
                System.out.println("Address="+temp+" and at index="+index);
            }
            index++;
            temp=temp.nextaddress;
        }
    }
    public class ConvertSLLtoDLL {

        public static DNode convert(SNode sHead) {
            if (sHead == null) return null;

            DNode dHead = null;
            DNode dTail = null;

            SNode temp = sHead;
            while (temp != null) {
                DNode newNode = new DNode(temp.value);

                if (dHead == null) {       // first node
                    dHead = newNode;
                    dTail = newNode;
                } else {
                    dTail.next = newNode;
                    newNode.prev = dTail;
                    dTail = newNode;
                }

                temp = temp.next;
            }

            return dHead;
        }

        // Helper to display DLL
        public static void displayDLL(DNode head) {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Example singly linked list
            SNode sHead = new SNode(10);
            sHead.next = new SNode(20);
            sHead.next.next = new SNode(30);
            sHead.next.next.next = new SNode(40);

            DNode dHead = convert(sHead);
            displayDLL(dHead); // Output: 10 20 30 40
        }
    }
}
