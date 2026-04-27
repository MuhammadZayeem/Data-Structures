public class LinkedList {
    Node head;
    int size=0;

    public void InsertAtLast(String html,String validation){
        Node node=new Node(html,validation);
        if(head==null){
            head=node;
            size++;
            return;
        }
        Node temp=head;
        while(temp.nextaddress!=null){
            temp=temp.nextaddress;
        }
        temp.nextaddress=node;
        size++;
    }
    public void display(){
        Node temp=head;
        int count=1;
        while (temp!=null){
            System.out.println(".........."+count+++"..........");
            System.out.println("Given String : "+temp.html_string);
            System.out.println("Validation : "+temp.validation);
            temp=temp.nextaddress;
        }
        System.out.println("List Finished...");
    }
}
